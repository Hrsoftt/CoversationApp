package com.example.conversationapp.data

import com.example.conversationapp.R

object LocalMessageDataProvider {

    val allMessages = listOf(
        Message(
            id = 0L,
            sender = LocalContactDataProvider.getContactAccountByUid(9L),
           // recipients = listOf(LocalContactDataProvider.getDefaultUserAccount()),
            subject = "Package shipped!",
            body = """
                Cucumber Mask Facial has shipped.

                Keep an eye out for a package to arrive between this Thursday and next Tuesday. If for any reason you don't receive your package before the end of next week, please reach out to us for details on your shipment.

                As always, thank you for shopping with us and we hope you love our specially formulated Cucumber Mask!
            """.trimIndent(),
            createdAt = "20 mins ago",
            isImportant = true,
            isStarred = true,
        ),
        Message(
            id = 1L,
            sender = LocalContactDataProvider.getContactAccountByUid(6L),
           // recipients = listOf(LocalContactDataProvider.getDefaultUserAccount()),
            subject = "Brunch this weekend?",
            body = """
                I'll be in your neighborhood doing errands and was hoping to catch you for a coffee this Saturday. If you don't have anything scheduled, it would be great to see you! It feels like its been forever.

                If we do get a chance to get together, remind me to tell you about Kim. She stopped over at the house to say hey to the kids and told me all about her trip to Mexico.

                Talk to you soon,

                Ali
            """.trimIndent(),
            createdAt = "40 mins ago",
        ),
        Message(
            2L,
            LocalContactDataProvider.getContactAccountByUid(5L),
            //listOf(LocalContactDataProvider.getDefaultUserAccount()),
            subject ="Bonjour from Paris",
            body = "Here are some great shots from my trip...",
            createdAt = "1 hour ago",
        ),
        Message(
            3L,
            LocalContactDataProvider.getContactAccountByUid(8L),
            subject = "High school reunion?",
            """
                Hi friends,

                I was at the grocery store on Sunday night.. when I ran into Genie Williams! I almost didn't recognize her afer 20 years!

                Anyway, it turns out she is on the organizing committee for the high school reunion this fall. I don't know if you were planning on going or not, but she could definitely use our help in trying to track down lots of missing alums. If you can make it, we're doing a little phone-tree party at her place next Saturday, hoping that if we can find one person, thee more will...
            """.trimIndent(),
            createdAt = "2 hours ago",
        ),
        Message(
            id = 4L,
            sender = LocalContactDataProvider.getContactAccountByUid(11L),
            subject = "Brazil trip",
            body = """
                Thought we might be able to go over some details about our upcoming vacation.

                I've been doing a bit of research and have come across a few paces in Northern Brazil that I think we should check out. One, the north has some of the most predictable wind on the planet. I'd love to get out on the ocean and kitesurf for a couple of days if we're going to be anywhere near or around Taiba. I hear it's beautiful there and if you're up for it, I'd love to go. Other than that, I haven't spent too much time looking into places along our road trip route. I'm assuming we can find places to stay and things to do as we drive and find places we think look interesting. But... I know you're more of a planner, so if you have ideas or places in mind, lets jot some ideas down!

                Maybe we can jump on the phone later today if you have a second.
            """.trimIndent(),
            createdAt = "2 hours ago",
            isStarred = true,
        ),
        Message(
            id = 5L,
            sender = LocalContactDataProvider.getContactAccountByUid(13L),
            subject = "Update to Your Itinerary",
            body = "",
            createdAt = "2 hours ago",
        ),
        Message(
            id = 6L,
            sender = LocalContactDataProvider.getContactAccountByUid(10L),
            subject = "Recipe to try",
            "Raspberry Pie: We should make this pie recipe tonight! The filling is " +
                    "very quick to put together.",
            createdAt = "2 hours ago",
        ),
        Message(
            id = 7L,
            sender = LocalContactDataProvider.getContactAccountByUid(9L),

            subject = "Delivered",
            body = "Your shoes should be waiting for you at home!",
            createdAt = "2 hours ago",
        ),
        Message(
            id = 8L,
            sender = LocalContactDataProvider.getContactAccountByUid(13L),
            subject = "Your update on Google Play Store is live!",
            body = """
              Your update, 0.1.1, is now live on the Play Store and available for your alpha users to start testing.
              
              Your alpha testers will be automatically notified. If you'd rather send them a link directly, go to your Google Play Console and follow the instructions for obtaining an open alpha testing link.
            """.trimIndent(),
            createdAt = "3 hours ago",
        ),
        Message(
            id = 9L,
            sender = LocalContactDataProvider.getContactAccountByUid(10L),
            subject = "(No subject)",
            body = """
            Hey, 
            
            Wanted to Message and see what you thought of
            """.trimIndent(),
            createdAt = "3 hours ago",
        ),
        Message(
            id = 10L,
            sender = LocalContactDataProvider.getContactAccountByUid(5L),
            subject = "Try a free TrailGo account",
            body = """
            Looking for the best hiking trails in your area? TrailGo gets you on the path to the outdoors faster than you can pack a sandwich. 
            
            Whether you're an experienced hiker or just looking to get outside for the afternoon, there's a segment that suits you.
            """.trimIndent(),
            createdAt = "3 hours ago",
        ),
        Message(
            id = 11L,
            sender = LocalContactDataProvider.getContactAccountByUid(5L),
            subject = "Free money",
            body = """
            You've been selected as a winner in our latest raffle! To claim your prize, click on the link.
            """.trimIndent(),
            createdAt = "3 hours ago",
        )
    )

}