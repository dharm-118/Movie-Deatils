package com.example.moviedeatils

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.setPadding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnMovieClickListner {

    private lateinit var recyclerView: RecyclerView
    val arrayList = ArrayList<Model>()


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recView)
        arrayList.add(
            Model(
                "Fast & Furious 9",
                "About Fast and Furious 9 ..." +
                        "\n" +
                        "\n" +
                        " \nDominic Toretto and his crew join forces to battle the most skilled assassin and high-performance driver they've ever encountered -- his forsaken brother.\n" +
                        "Release date: June 2021 (India)\n" +
                        "Director: Justin Lin\n" +
                        "Budget: \$200 million+\n" +
                        "Producers: Vin Diesel, Justin Lin, Samantha Vincent, Clayton Townsend, Jeff Kirschenbaum, Neal H. Moritz, Joe Roth\n" +
                        "Production companies: Universal Pictures, One Race Films, Original Film, Roth/Kirschenbaum Films" +
                        "Production\n" +
                        "Development\n" +
                        "In November 2014, Universal Pictures chairwoman Donna Langley told The Hollywood Reporter that there would be at least three more films in the franchise after Furious 7 (2015).[16] In October 2017, Diesel revealed in a Facebook live video that Justin Lin, who directed from The Fast and the Furious: Tokyo Drift through Fast & Furious 6, would be returning for the ninth and tenth films.[17][18] In May 2018, Daniel Casey was hired to write the screenplay after Morgan left due to his work on the Hobbs and Shaw spin-off film.[19]\n" +
                        "\n" +
                        "Casting\n" +
                        "In April 2017, Diesel and Dwayne Johnson confirmed their returns.[20] In October 2017, Jordana Brewster, who portrayed Mia Toretto in five of the franchise's films, would be returning for the ninth and tenth films.[17] On April 4, 2018, Johnson stated that he was unsure if he was returning for the ninth film due to working on the spin-off,[21] and he confirmed in January 2019 that he would not be appearing in the film.[22]\n" +
                        "\n" +
                        "In June 2019, John Cena was officially cast in the film, after an initial announcement from Diesel in April.[6] In July 2019, Finn Cole, Anna Sawai, and Vinnie Bennett joined the cast of the film.[12] That same month, it was announced Helen Mirren and Charlize Theron would reprise their roles,[9] with Michelle Rodriguez was also confirmed to reprise her role.[23] Michael Rooker and MMA Fighter Francis Ngannou[15] were added to the cast in August.[13] In October 2019, Ozuna and Cardi B joined the cast of the film.[14][11]\n" +
                        "\n" +
                        "Filming\n" +
                        "Principal photography began on June 24, 2019, at Leavesden Studios in Hertfordshire, England.[24] Filming took place in Los Angeles, Edinburgh,[25][26] and London,[27] and also took place in Thailand for the first time, with Krabi, Ko Pha-ngan, and Phuket used as locations.[28] Part of the film was also shot in Tbilisi, Georgia.[29][30] Filming wrapped on November 11, 2019.[31]\n" +
                        "\n" +
                        "In July 2019, stuntman Joe Watts, who doubled for Diesel, sustained a serious head injury during filming at Leavesden Studios.[32][33] In September 2020, Michelle Rodriguez confirmed the film would be set in outer space as well, which was teased by Diesel.[34]\n" +
                        "\n" +
                        "Music\n" +
                        "F9's official soundtrack will be released concurrently with the film. In the lead up to the soundtrack, a mixtape titled Road to F9 was released on July 31, 2020, and features music inspired by the film. The mixtape was preceded by the lead single \"One Shot\" by YoungBoy Never Broke Again and Lil Baby.[35]",
                R.drawable.f9,
                "8/10"
            )
        )
        arrayList.add(
            Model(
                "Tom & Jerry The Movie",
                "About Tom And Jerry..." +
                        "\n" +
                        "\n" +
                        "\nA legendary rivalry reemerges when Jerry moves into New York City's finest hotel on the eve of the wedding of the century, forcing the desperate event planner to hire Tom to get rid of him. As mayhem ensues, the escalating cat-and-mouse battle soon threatens to destroy her career, the wedding, and possibly the hotel itself.\n" +
                        "Release date: 26 February 2021 (India)\n" +
                        "Director: Tim Story\n" +
                        "Cinematography: Alan Stewart\n" +
                        "Story by: William Hanna, Joseph Barbera\n" +
                        "Production companies: Warner Animation Group, Turner Entertainment" +
                        "Production\n" +
                        "Development\n" +
                        "Plans for a live-action Tom and Jerry film were announced in 2009, after the success of Alvin and the Chipmunks, and would’ve follow Tom and Jerry's origins over a Chicago backdrop. The film would’ve been produced by Dan Lin, from a script written by Eric Gravning.[11]\n" +
                        "\n" +
                        "On April 6, 2015, plans shifted from a live-action film to a fully animated film, that would stay \"in the same vein as the source material\".[12]\n" +
                        "\n" +
                        "In October 2018, it was announced that Tim Story would direct a live-action/animated Tom and Jerry film for Warner Bros., which would begin filming in 2019. It was reported that Story was in discussions with Warner Bros. executives about what he was interested in directing, even before directing the new Shaft film. When the Tom and Jerry film was brought up, Story immediately \"mentioned his admiration for the characters and how he'd love tackling that property.\"[13]\n" +
                        "\n" +
                        "Casting\n" +
                        "In March 2019, it was reported that Zoey Deutch and Olivia Cooke were frontrunners for the lead live-action role of Kayla, “who teams up with Tom to stop the pesky Jerry from ruining an important event for herself.” Additionally, Sofia Carson, Elle Fanning, Jennifer Lawrence, Ariel Winter, Naomi Scott, Meg Donnelly, Hailee Steinfeld, Yara Shahidi, Kelly Marie Tran, Becky G and Isabela Moner were all in consideration for the role.[14] Later that month, it was reported that Peter Dinklage was being considered for the role of Terrance, Kayla's boss and the human antagonist of the film.[15] In April, Chloë Grace Moretz was in final negotiations to star in the film.[16] [17] Moretz described Kayla as \"a lot like Jerry\" and as \"a girl who gunned for what she wanted to achieve but realizes that time and honesty is what will prevail in the end\", as well as \"a total goofball\", the latter aspect which allowed Moretz to \"lean into who [she is] in real life\".[18] She also said Kayla is \"a little unlikeable with some of the decisions she makes\", yet she still wanted the character to feel likeable.[19] Moretz was inspired in her performance by Bob Hoskins' performance as Eddie Valiant in Who Framed Roger Rabbit, as well as by actresses Sandra Bullock, Jennifer Aniston, Lucille Ball, and Meg Ryan.[19] In May 2019, Michael Peña joined the cast in the role Dinklage was eyed for.[20] Colin Jost, Ken Jeong, Rob Delaney, Jordan Bolger and Pallavi Sharda were added to the cast in July.[21][22] Patsy Ferran was revealed to be part of the cast in September 2019.[23]\n" +
                        "\n" +
                        "In November 2020, Nicky Jam and Lil Rel Howery revealed that they have been cast in the film in voice roles.[24][25] On December 2, 2020, Jam revealed that he will be the voice of Butch Cat in the film.[26]\n" +
                        "\n" +
                        "Filming\n" +
                        "Principal photography began in July 2019 at Warner Bros. Studios, Leavesden in Hertfordshire, England.[27] The film was shot by cinematographer Alan Stewart, on the Sony VENICE cinema cameras and Panavision Primo 70 and Primo Artiste Lenses.[28] Animators were present during filming, allowing cast members to improvise while figures of the titular characters were handled by puppeteers.[19] Filming ended before the industry's shutdown in response to the COVID-19 pandemic.[29]\n" +
                        "\n" +
                        "Animation\n" +
                        "Animation services were provided by Framestore, who hired 3D animators with a passion for 2D animation for the project. The strategy the animators used was to base the animation off a stylized 3D/CGI VFX modeling medium through a vintage 2D finish by creating innovative rigging, animation techniques used to create 2D animation, and custom tools such as lighting and rendering, resulting in the film's 3D/CGI animation maintaining the look, feel, and spirit of 2D animation, in the vein of the original classic shorts in the 1940s and 1950s.[30] The animators also used early Tom and Jerry shorts as reference and inspiration for the animation sequences.[31] Work on the animation was done remotely during the pandemic, with the filmmakers doing creative exploration on certain shots, and finalizing material through production groups.[32][29]\n" +
                        "\n" +
                        "Music\n" +
                        "On July 22, 2020, it was announced that Tim Story's recurring collaborator and composer Christopher Lennertz is set to compose the score of the film.[33] The album was released by WaterTower Music on February 12, having 30 tracks.[34]\n" +
                        "\n" +
                        "Release\n" +
                        "Theatrical and streaming\n" +
                        "Tom & Jerry was released in the United States on February 26, 2021, by Warner Bros. Pictures, in theaters and for a month streaming on HBO Max. The movie coincidentally released on Tex Avery's birthdate, in which the movie stars for a brief second one of Avery's characters, Droopy, in an animal shelter and on a Joker parody billboard.[35][36][37] It is the first film to officially debut the new Warner Animation Group logo to match with the new shield that Warner Bros. debuted in November 2019.[38] It was originally scheduled to be released on April 16, 2021,[39] but was pushed up to December 23, 2020.[40] The film was then pushed back to March 5, 2021 due to the COVID-19 pandemic, before moving up a week in order to avoid competition with Disney's Raya And The Last Dragon.[41] Samba TV estimated that 1.2 million U.S. households streamed the film over its opening weekend on HBO Max.[42]\n" +
                        "\n" +
                        "On March 8, 2021, some HBO Max viewers who attempted to watch the film were accidentally shown Zack Snyder's Justice League, a movie which was supposed to release 10 days later. HBO Max quickly fixed the issue within an hour. [43]\n" +
                        "\n" +
                        "Marketing\n" +
                        "A float of the characters appeared in the 94th Macy's Thanksgiving Day Parade to promote the film.[44] On September 1, 2020, it was announced that Australian toy company Moose Toys made a deal with Warner Bros. to make merchandise for the film along with the upcoming film Space Jam: A New Legacy.[45]\n" +
                        "\n" +
                        "On February 20, 2021, Warner Bros. released two new shorts onto HBO Max titled Tom and Jerry Special Shorts to honor the 81st anniversary of Tom and Jerry, as well as to promote the film. These shorts share the style of the other HBO Max original Looney Tunes Cartoons, also produced by Warner Bros. Animation.[46][47][48][better source needed]\n" +
                        "\n" +
                        "In early March 2021, it was announced that Rob Delaney would be the star guest Announcer for Ant & Dec's Saturday Night Takeaway, whereas the titular characters would also make an appearance themselves with Sir Tom Jones.",
                R.drawable.tomandjerry,
                "10/10"
            )
        )
        arrayList.add(
            Model(
                "Kung Fu Panda",
                "About Kung Fu Panda..." +
                        "\n" +
                        "\n" +
                        "\nWhen Po the Panda, a kung fu enthusiast, gets selected as the Dragon Warrior, he decides to team up with the Furious Five and destroy the evil forces that threaten the Valley of Peace.\n" +
                        "Release date: 11 July 2008 (India)\n" +
                        "Directors: Mark Osborne, John Stevenson\n" +
                        "Animated series: Kung Fu Panda: Legends of Awesomeness; Kung Fu Panda: The Paws of Destiny\n" +
                        "Film(s): Kung Fu Panda (2008); Kung Fu Panda 2 (2011); Kung Fu Panda 3 (2016)\n" +
                        "Created by: Ethan Reiff and Cyrus Voris\n" +
                        "Owned by: DreamWorks Animation" +
                        "Kung Fu Panda is a media franchise by DreamWorks Animation, consisting of three films: Kung Fu Panda (2008), Kung Fu Panda 2 (2011) and Kung Fu Panda 3 (2016). The first two were distributed by Paramount Pictures, while the third film was distributed by 20th Century Fox. Three shorts, Secrets of the Furious Five (2008), Kung Fu Panda Holiday Special (2010) and Kung Fu Panda: Secrets of the Masters (2011), were also released. A television series for Nickelodeon television network, Kung Fu Panda: Legends of Awesomeness, premiered in 2011. A second series, Kung Fu Panda: The Paws of Destiny, was released on Amazon Prime in November 2018.\n" +
                        "\n" +
                        "The franchise, set in a fantasy wuxia genre version of ancient China populated by anthropomorphic animals, features the adventures of Po Ping, a giant panda, who was improbably chosen as the prophesied Dragon Warrior. Although his status is initially doubted, Po proves himself worthy as he strives to fulfill his destiny and learn about his past with his new friends.\n" +
                        "\n" +
                        "The film series has been highly acclaimed with its first two features being nominated for the Academy Award for Best Animated Feature as well as numerous Annie Awards while the television series has won 11 Emmy Awards. The first three films were the most financially successful animated feature film for their years[1] and the second is the second biggest worldwide box office success for a film directed solely by a woman (Jennifer Yuh Nelson), after Wonder Woman." +
                        "Kung Fu Panda (2008)\n" +
                        "Main article: Kung Fu Panda (film)\n" +
                        "Po, a clumsy panda, is a kung fu fanatic who lives in the Valley of Peace and works in his goose father Mr. Ping's noodle shop, unable to realize his dream of learning kung fu. One day, a kung fu tournament is held for the elderly spiritual leader of the valley, Grand Master Oogway, to determine the identity of the Dragon Warrior, the one kung fu master capable of understanding the secret of the Dragon Scroll, which is said to contain the key to limitless power. Everyone in the valley expects the Dragon Warrior to be one of the Furious Five—Tigress, Monkey, Mantis, Viper, and Crane—a quintet of kung fu warriors trained by Master Shifu to protect the valley. To everyone's surprise, Oogway chooses Po, who had accidentally stumbled into the tournament arena after arriving late via fireworks explosion.\n" +
                        "\n" +
                        "Refusing to believe that Po can be the Dragon Warrior, Shifu subjects Po to torturous training exercises in order to discourage him into quitting. Determined to change himself into someone he can respect, Po perseveres in his training and befriends the Furious Five, who had previously mocked Po for his lack of skill in kung fu. Po soon learns that Tai Lung is approaching the Valley, an evil kung fu warrior who has escaped from prison to take revenge for being denied the Dragon Scroll, and despairs he will be unable to defeat him. However, Shifu discovers that Po is capable of martial arts when motivated by food, and successfully trains him to learn kung fu. After his training is complete, Po is given the Dragon Scroll, which he discovers to be blank. However, Po realizes that the key to limitless power lies within himself, allowing him to defeat Tai Lung and restore peace to the valley.\n" +
                        "\n" +
                        "Kung Fu Panda 2 (2011)\n" +
                        "Main article: Kung Fu Panda 2\n" +
                        "Po now lives his dream as a kung fu master and protects the Valley of Peace alongside the Furious Five. However, he is thrown into internal conflict when he begins having flashbacks of his mother and learns from Mr. Ping that he was adopted as an infant. Shortly after, Po and the Five are sent on a mission to stop the evil peacock Lord Shen from using a newly developed weapon, the cannon, to conquer all of China and destroy kung fu tradition. Po remains tormented by thoughts of being abandoned by his real parents until he is guided by a wise old soothsayer to embrace his past, and remembers that his parents risked their lives to save him from Shen, who had set out to exterminate all pandas after learning of a prophecy that he would be defeated by \"a warrior of black-and-white\". Po achieves inner peace, which allows him to destroy Shen's new weapon, defeat Shen, and accept Mr. Ping as his father. However, during the last scene of the movie, it shows Po's biological father realizing his son is alive.\n" +
                        "\n" +
                        "Kung Fu Panda 3 (2016)\n" +
                        "Main article: Kung Fu Panda 3\n" +
                        "Shortly after the events of the second film, Shifu relinquishes his duties as master of the Jade Palace to Po, claiming that the next step of his own apprenticeship is to oversee the Furious Five's training. While struggling with this new responsibility, Po rejoices upon reuniting with his biological father, Li, though Mr. Ping is less enthusiastic. However, news arrives that the spirit warrior General Kai has returned to the mortal realm and is 'collecting' Kung Fu masters from all over China, both living and dead, to serve in his army of Jade Zombies. Po and the others discover from a scroll left by Oogway that Kai can only be defeated by the power of Chi, a technique known only by the panda colonies; thus, Po and Li set to the secret Panda Valley in order to have Po learn it. Po eventually discovers, to his horror, that Li had deceived him, because the pandas have long forgotten about how to manipulate the Chi, and he just wanted to protect his son from Kai. Once making amends with both his adoptive and biological fathers, Po joins forces with Ping, Tigress, and the pandas to make a stand against Kai, all mastering the power of Chi in the process and using its power to destroy him for good. After returning to the Valley of Peace, Po spends his days spreading the teachings of Kung fu and Chi.\n" +
                        "\n" +
                        "Future\n" +
                        "DreamWorks Animation CEO Jeffrey Katzenberg has said that it is possible that the series could see three more sequels after Kung Fu Panda 3, bringing it to a six-film series.[2]\n" +
                        "\n" +
                        "On January 13, 2016, Collider asked the filmmakers of Kung Fu Panda 3 about the possibility of a fourth film.[3] Co-director Jennifer Yuh Nelson said, \"It’s one at a time. We want to make this a perfect jewel, and then we’ll see what happens after that.\"[3] Co-director Alessandro Carloni said, \"With the sequels, we don’t want to try to have them feel open-ended. We want it to feel like a completed journey, and we feel this movie does. And then, if a fantastic story presents itself, great.\"[3]\n" +
                        "\n" +
                        "On August 2, 2018, when asked about any updates on Kung Fu Panda 4, Nelson replied that she did not know as she had always seen the series as a trilogy, but that she was open to the idea of a fourth installment as long as it focused on Po.[4]",
                R.drawable.kungfupanda,
                "6/10"
            )
        )
        arrayList.add(
            Model(
                "Soul",
                "About Soul ..." +
                        "\n" +
                        "\n" +
                        "\nA jazz musician, stuck in a mediocre job, finally gets his big break. However, when a wrong step takes him to the Great Before, he tries to help an infant soul in order to return to reality.\n" +
                        "Initial release: 25 December 2020 (Ukraine)\n" +
                        "Director: Pete Docter\n" +
                        "Budget: \$150 million+\n" +
                        "Box office: 11.17 crores USD\n" +
                        "Screenplay: Pete Docter, Kemp Powers, Mike Jones" +
                        "Production\n" +
                        "Development\n" +
                        "Pete Docter began developing Soul in January 2016, as he sought new creative directions after winning his second Academy Award (for Inside Out). Producer Dana Murray recalled, \"Pete had this feeling, 'Is this it? Do I just do this again?' I don’t know if it was a midlife crisis as much as a midlife what-am-I-doing? moment\".[15][16][17] Docter pondered the origins of human personalities as well as the concept of determinism. In his first meeting with co-writer Mike Jones, Docter pitched an idea \"set in a place beyond space and time, where souls are given their personalities\".[15]\n" +
                        "\n" +
                        "In June 2018, it was announced that Docter was planning to complete his film despite being appointed Chief Creative Officer at Pixar after John Lasseter's departure.[18] In June 2019, Pixar formally announced the new film, titled Soul, with Docter directing and Murray producing.[19] A synopsis released on Twitter described the film as a cosmic journey through New York City.[20]\n" +
                        "\n" +
                        "Writing\n" +
                        "Pixar chose to portray the film's main character as a musician, because they wanted a \"profession the audience could root for\", and settled for a musician after trying for a scientist, which \"[didn't feel] so naturally pure as a musician's life\". Docter described Soul as \"an exploration of, where should your focus be? What are the things that, at the end of the day, are really going to be the important things that you look back on and go, 'I spent a worthy amount of my limited time on Earth worrying or focused on that'?\"[21]\n" +
                        "\n" +
                        "Docter and Jones worked on the development of the main character for about two years.[15] According to Docter, once they settled on the main character being a jazz musician, the filmmakers chose to make the character African-American, as they felt it made sense due to how closely African-Americans have been tied to jazz history.[22][23] Powers originally joined as co-writer early in development to help write the character of Joe, and was initially given a 12-week contract, which was then extended.[15] He was subsequently promoted to co-director after his extensive contributions to the film, making him Pixar's first African-American co-director.[23] Powers based several elements of Joe on his personal life, as the character's story shared several elements with Powers' own, but also wanted him to \"transcend [his] own experience\" in order to make the character more accessible.[22] Powers also placed additional emphasis on authentically depicting the black community as well as Joe's relationships with them.[24] In order to portray accurately African-American culture within the film, Pixar created an internal culture trust composed of black Pixar employees, and hired several consultants, among whom were musicians Herbie Hancock, Terri Lyne Carrington, Quincy Jones and Jon Batiste, educator Johnnetta Cole, and stars Questlove and Daveed Diggs. The filmmakers worked closely with them through the film's development.[22][24]\n" +
                        "\n" +
                        "The idea for the therapy cat and Joe landing inside its body came from Jones. Docter and Powers appreciated the idea, as it offered the filmmakers a much needed way for Joe to \"be able to look at his own life from a different perspective\" and appreciate it.[25]\n" +
                        "\n" +
                        "According to Murray, the filmmakers were undecided on the ending of the film \"up until the last screening\". Some versions of the ending had Joe actually passing on to the Great Beyond, while other ones had him returning to Earth a year later, or staying in the Great Before as a mentor. A number of brief scenes showing 22's life on Earth after her new birth, including one of her reuniting with Joe in New York, were storyboarded. Docter considered it \"much more powerful to give the decision to the audience\" and ultimately discarded these scenes.[25]\n" +
                        "\n" +
                        "Casting\n" +
                        "In August 2019, Jamie Foxx, Tina Fey, Questlove, Phylicia Rashad and Daveed Diggs were announced as starring in the film.[4][9] In March 2020, Angela Bassett announced she was in the cast.[12] With the release of the film's trailer in October 2020, Richard Ayoade, Graham Norton, Rachel House, Alice Braga, Wes Studi, Fortune Feimster, Zenobia Shroff, Donnell Rawlings and June Squibb were also announced to be in the cast.[7][5][8]\n" +
                        "\n" +
                        "Foxx, who was cast to voice Joe, had been Pixar's top pick for the role as they considered his comedy skills, dramatic ability and musician background a perfect fit.[26] He found the protagonist's passion for music relatable, stating that early in his career music was \"all I wanted to do ... I grew my hair out. I had a Jheri curl like Lionel Richie... But comedy took off first.\"[27] Foxx had previously won an Oscar playing a musician, in the role of Ray Charles in the 2004 film Ray.[28] He also related to the film's \"bittersweet [feeling] of losing someone but gaining a vision of joy\", following the death of his sister in October 2020 at the age of 36.[28][29] Fey, in addition to voicing 22, also contributed to the screenplay, having helped to write her character's lines.[21] She considered the film, in the context of the COVID-19 pandemic, a \"helpful reminder that [life] isn't defined by achievement or attainment\".[28]\n" +
                        "\n" +
                        "Pixar mainstay John Ratzenberger was also reported by some news outlets to be a part of the cast.[30] However, one reviewer who screened the film later noted that Ratzenberger's name is absent from the film's credits and all official cast listings, and the reviewer did not recognize his voice at any point during the film.[31] Docter had reportedly said that Ratzenberger makes a \"cameo\" in the film,[32] despite not being credited in the main cast or additional voices. Co-director Kemp Powers later confirmed that Ratzenberger's appearance was not a voice role as per usual, but instead a tribute as a non-speaking background character in the film that was animated in his likeness, making Soul the first Pixar film to not feature his voice.[33]\n" +
                        "\n" +
                        "Animation\n" +
                        "Soul is Pixar's first film to feature an African-American protagonist.[34] Pixar was mindful of the history of racist imagery in animation, and set out to create characters who were recognizably black while avoiding the stereotypes in old cartoons. Acknowledging this effort, Docter stated that \"There's a long and painful history of caricatured racist design tropes that were used to mock African-Americans.\"[15] According to Powers, the animators used lighting as a way to highlight the ethnic diversity in the living world.[35] Pixar sought to capture the fine details of these black characters, including the textures of black hair and the way light plays on various tones of black skin.[15] Cinematographer Bradford Young worked as a lighting consultant on the film.[35]\n" +
                        "\n" +
                        "Animators used footage of several music performers, including jazz composer Jon Batiste, performing as reference for the film's musical sequences.[35] By capturing MIDI data from the sessions, animators were able to retrace the exact key being played on the piano with each note and create the performances authentically.[35][36] According to Docter, the animators assigned to specific musical instruments often either had experience playing them or a great appreciation for them.[36]\n" +
                        "\n" +
                        "The filmmakers animated the souls featured in the film in a \"vaporous\", \"ethereal\", and \"non physical\" way, having based their designs on definitions about souls given to them by various religious and cultural representatives.[21] At the same time, they did not want the souls to look overly similar to ghosts, and adjusted their color palette accordingly.[37] Docter described the design as \"a huge challenge\", as the animators are \"used to toys, cars, things that are much more substantial and easily referenced\", though he felt the animation team \"really put some cool stuff together that's really indicative of those words but also relatable\".[21] According to Murray, several artists helped create the souls' designs by giving their suggestions and opinions on how they should look.[38] The designs were also inspired by early drawings made by Docter. Animators created two designs for the souls in the film; one for the new souls in \"The Great Before\", which animation supervisor Jude Brownbill described as \"very cute, very appealing, with simple, rounded shapes and no distinguishing features just yet\", and one for mentor souls, which do feature distinctive characteristics due to having been on Earth already.[39]\n" +
                        "\n" +
                        "The design of soul counselors (\"Jerrys\") originated from line drawings made by story artist Aphton Corbin; another artist then created wire sculptures of them, upon which the final design was based.[37] Together with the design of \"Terry\", they were seen by critics as a reference to Osvaldo Cavandoli's 1971 animated series La Linea.[40][41][42]\n" +
                        "\n" +
                        "For the Great Before, the filmmakers did not want it to be based in any specific culture given its nature of universality. They sought inspiration from the architecture of 1930s-1960s world's fairs, which was \"meant to inspire, to create a sense of awe and importance.\"[43] According to Docter, the aim of the design was to \"make a grand statement about learning and knowledge.\"[44] The personality pavilions were designed to be \"abstract-looking shapes\" as a literal interpretation of the abstract ideas they represent.[43] For the Great Beyond, the filmmakers went with a direct take on the concept of \"going toward the light\", which they believe would be immediately understood by the audience.[37]\n" +
                        "\n" +
                        "Music\n" +
                        "Main article: Soul (soundtrack)\n" +
                        "American musicians Trent Reznor and Atticus Ross of Nine Inch Nails composed an music score for the metaphysical segments of the film, while American musician Jon Batiste composed a number of original jazz songs for the New York City-based segments of the film.[45][46] Batiste sought to create what he referred to as \"user-friendly jazz\", which would feel \"authentic\" and still be appreciated by a general audience.[22][47] Reznor and Ross were brought in on the recommendation of sound designer Ren Klyce, who had worked extensively with the duo in David Fincher films.[48]\n" +
                        "\n" +
                        "The score and the original songs from Soul were released in two separate vinyl-exclusive albums, while also both being compiled onto a digital album.[49][50] \"It's All Right\", the end credits song performed by Batiste was originally recorded by The Impressions while a second cover of the song is a duet between Batiste and British soul singer Celeste which is not included in the film's soundtrack, but was released as a non-album single alongside the three albums.[51][52]",
                R.drawable.soul,
                "9/10"
            )
        )

        val myAdapterClass = MyAdapterClass(arrayList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapterClass
        myAdapterClass.notifyDataSetChanged()


    }

    override fun onMovieItemClicked(position: Int) {
        val intent = Intent(this, MovieDetails::class.java)
        intent.putExtra("name", arrayList[position].mMovieName)
        intent.putExtra("description", arrayList[position].mMovieDescription)
        intent.putExtra("movie poster", arrayList[position].image)
        startActivity(intent)
    }


}