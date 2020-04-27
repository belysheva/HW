<template>
<!--    <v-simple-table>-->
<!--        <template v-slot:default>-->
<!--            <thead>-->
<!--            <tr>-->
<!--                <th class="text-left">ID</th>-->
<!--                <th class="text-left">WORLD</th>-->
<!--            </tr>-->
<!--            </thead>-->
<!--            <tbody>-->
<!--            <tr v-for="item in worlds" :key="item.key">-->
<!--                <td>{{ item.key }}</td>-->
<!--                <td>{{ item.value }}</td>-->
<!--            </tr>-->
<!--            </tbody>-->
<!--        </template>-->
<!--    </v-simple-table>-->
    <v-app id="inspire">
        <v-app-bar
                app
                color="red"
                light
        >
            <v-toolbar-title align = "center">
                <span class="white--text">Hello World</span>
            </v-toolbar-title>
            <v-spacer></v-spacer>
            <v-btn >
                <iron-icon @click="sayHello" style="animation-fill-mode: both">say Hello</iron-icon>
            </v-btn>
        </v-app-bar>
        <v-content>
            <v-container
                    class="fill-height"
                    fluid
                    style="animation: frames(5)"
            >
                <v-row
                        align="center"
                        justify="left"
                >
                    <v-col class="text-center">
                        <greetings-list :worlds="worlds"/>
                    </v-col>
                </v-row>
            </v-container>
        </v-content>

        <v-footer
                color="grey"
                app
                light
        >
            <v-spacer/>

            <span class="white--text">ОЦРВ &copy; 2020</span>
        </v-footer>
    </v-app>
</template>

<script>
    import worlds from "../api/greeting"
    import GreetingsList from '../components/GreetingsList.vue'

    export default {
        name: "Great",
        components: {
            GreetingsList
        },
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
        },
        methods: {
            sayHello() {
                this.worlds = worlds
            },
        }
    }
</script>
<style>
</style>
