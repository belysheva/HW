<template>
    <div style="position: relative; width: 300px; animation: ease-in">
        <greeting-row v-for="greeting in worlds"
                     :greeting="greeting"
                     :worlds="worlds"/>
    </div>
</template>

<script>
   import GreetingRow from "../components/GreetingRow.vue";

    export default {
        props: ['worlds'],
        components: {
            GreetingRow,
        },
        data() {
            return {
                greeting: null
            }
        },
    }
</script>

<style>

</style>
