<template>
    <div>
        <messages-list :greetings="greetings"/>
    </div>
</template>

<script>
    import MessagesList from 'MessagesList.vue'

    export default {
        components: {
            MessagesList
        },
        data() {
            return {
                greetings: frontendData.greetings
            }
        }
    }

</script>

<style>
</style>
