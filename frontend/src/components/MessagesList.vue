<template>
    <div style="position: relative; width: 300px;">
        <message-row v-for="message in greetings"
                     :message="message"
                     :messages="greetings"/>
    </div>
</template>

<script>
    import MessageRow from 'MessageRow.vue'

    export default {
        props: ['greetings'],
        components: {
            MessageRow,
        },
        data() {
            return {
                message: null
            }
        },
        methods: {
            editMessage(message) {
                this.message = message
            },
            deleteMessage(message) {
                this.$resource('/message{/id}').remove({id: message.id}).then(result => {
                    if (result.ok) {
                        this.messages.splice(this.messages.indexOf(message), 1)
                    }
                })
            }
        }
    }
</script>

<style>

</style>
