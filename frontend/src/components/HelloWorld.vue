<template>
    <v-simple-table>
        <template v-slot:default>
            <thead>
            <tr>
                <th class="text-left">ID</th>
                <th class="text-left">WORLD</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="item in worlds" :key="item.key">
                <td>{{ item.key }}</td>
                <td>{{ item.value }}</td>
            </tr>
            </tbody>
        </template>
    </v-simple-table>
</template>

<script>
    import worlds from "../api/greeting"

    export default {
        name: "Great",
        data() {
            return {
                worlds: []
            }
        },
        async beforeMount() {
            const response = await worlds.allWorlds()
            const map = await new Map(Object.entries(response.body))
            await map.forEach((v, k) =>
                this.worlds.push(
                    new Object({
                        key: k,
                        value: v
                    })
                )
            )
        }
    }
</script>
<style>
</style>
