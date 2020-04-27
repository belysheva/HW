<template>
    <v-card class="my-1">
        {{ greeting.value }}
    </v-card>
</template>

<script>
    export default {
        props: ['greeting', 'worlds'],
        methods: {}
    }
</script>

<style>

</style>
