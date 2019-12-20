<!doctype html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/">
<html>
    <head>
        <meta charset="utf-8">
        <title>CSS3卡片3D翻转动画DEMO演示</title>

        <style>
            *, *:before, *:after {
                box-sizing: border-box;
            }

            html {
                font-size: 18px;
                line-height: 1.5;
                font-weight: 300;
                color: #333;
                font-family: "Nunito Sans", sans-serif;
            }

            body {
                margin: 0;
                padding: 0;
                height: 100vh;
                background-color: #ecf0f9;
                background-attachment: fixed;
            }

            .content {
                display: flex;
                margin: 0 auto;
                justify-content: center;
                align-items: center;
                flex-wrap: wrap;
                max-width: 1000px;
            }

            .heading {
                width: 100%;
                margin-left: 1rem;
                font-weight: 900;
                font-size: 1.618rem;
                text-transform: uppercase;
                letter-spacing: .1ch;
                line-height: 1;
                padding-bottom: .5em;
                margin-bottom: 1rem;
                position: relative;
            }

            .heading:after {
                display: block;
                content: '';
                position: absolute;
                width: 60px;
                height: 4px;
                background: linear-gradient(135deg, #1a9be6, #1a57e6);
                bottom: 0;
            }

            .description {
                width: 100%;
                margin-top: 0;
                margin-left: 1rem;
                margin-bottom: 3rem;
            }

            .card {
                color: inherit;
                cursor: pointer;
                width: calc(33% - 2rem);
                min-width: calc(33% - 2rem);
                height: 400px;
                min-height: 400px;
                perspective: 1000px;
                margin: 1rem;
                position: relative;
            }

            @media screen and (max-width: 800px) {
                .card {
                    width: calc(50% - 2rem);
                }
            }

            @media screen and (max-width: 500px) {
                .card {
                    width: 100%;
                }
            }

            .front,
            .back {
                display: flex;
                border-radius: 6px;
                background-position: center;
                background-size: cover;
                text-align: center;
                justify-content: center;
                align-items: center;
                position: absolute;
                height: 100%;
                width: 100%;
                -webkit-backface-visibility: hidden;
                backface-visibility: hidden;
                transform-style: preserve-3d;
                transition: ease-in-out 600ms;
            }

            .front {
                background-size: cover;
                padding: 2rem;
                font-size: 1.618rem;
                font-weight: 600;
                color: #fff;
                overflow: hidden;
                font-family: Poppins, sans-serif;
            }

            .front:before {
                position: absolute;
                display: block;
                content: '';
                top: 0;
                left: 0;
                right: 0;
                bottom: 0;
                background: linear-gradient(135deg, #1a9be6, #1a57e6);
                opacity: .25;
                z-index: -1;
            }

            .card:hover .front {
                transform: rotateY(180deg);
            }

            .card:nth-child(even):hover .front {
                transform: rotateY(-180deg);
            }

            .back {
                background: #fff;
                transform: rotateY(-180deg);
                padding: 0 2em;
            }

            .card:hover .back {
                transform: rotateY(0deg);
            }

            .card:nth-child(even) .back {
                transform: rotateY(180deg);
            }

            .card:nth-child(even):hover .back {
                transform: rotateY(0deg);
            }

            .button {
                transform: translateZ(40px);
                cursor: pointer;
                -webkit-backface-visibility: hidden;
                backface-visibility: hidden;
                font-weight: bold;
                color: #fff;
                padding: .5em 1em;
                border-radius: 100px;
                font: inherit;
                background: linear-gradient(135deg, #1a9be6, #1a57e6);
                border: none;
                position: relative;
                transform-style: preserve-3d;
                transition: 300ms ease;
            }

            .button:before {
                transition: 300ms ease;
                position: absolute;
                display: block;
                content: '';
                transform: translateZ(-40px);
                -webkit-backface-visibility: hidden;
                backface-visibility: hidden;
                height: calc(100% - 20px);
                width: calc(100% - 20px);
                border-radius: 100px;
                left: 10px;
                top: 16px;
                box-shadow: 0 0 10px 10px rgba(26, 87, 230, 0.25);
                background-color: rgba(26, 87, 230, 0.25);
            }

            .button:hover {
                transform: translateZ(55px);
            }

            .button:hover:before {
                transform: translateZ(-55px);
            }

            .button:active {
                transform: translateZ(20px);
            }

            .button:active:before {
                transform: translateZ(-20px);
                top: 12px;
            }
        </style>

    </head>
    <body>
        <div style="text-align:center;clear:both;">
        </div>
        <div class="content">
            <a class="card" href="post/getAllpostsByBlock?block=1">
                <div class="front" style="background-image: url(resources/images/57.jpeg);">
                    <p>动漫区</p>
                </div>
                <div class="back">
                    <div>
                        <p>Consectetur adipisicing elit. Possimus, praesentium?</p>
                        <p>Provident consectetur natus voluptatem quis tenetur sed beatae eius sint.</p>
                        <button class="button">Click Here</button>
                    </div>
                </div>
            </a>
            <a class="card" href="post/getAllpostsByBlock?block=2">
                <div class="front" style="background-image: url(resources/images/60.jpeg);">
                    <p>影视区</p>
                </div>
                <div class="back">
                    <div>
                        <p>Consectetur adipisicing elit. Possimus, praesentium?</p>
                        <p>Provident consectetur natus voluptatem quis tenetur sed beatae eius sint.</p>
                        <button class="button">Click Here</button>
                    </div>
                </div>
            </a><a class="card" href="post/getAllpostsByBlock?block=3">
                <div class="front" style="background-image: url(resources/images/63.jpeg);">
                    <p>运动区</p>
                </div>
                <div class="back">
                    <div>
                        <p>Consectetur adipisicing elit. Possimus, praesentium?</p>
                        <p>Provident consectetur natus voluptatem quis tenetur sed beatae eius sint.</p>
                        <button class="button">Click Here</button>
                    </div>
                </div>
            </a><a class="card" href="post/getAllpostsByBlock?block=4">
                <div class="front" style="background-image: url(resources/images/79.jpeg);">
                    <p>数码</p>
                </div>
                <div class="back">
                    <div>
                        <p>Consectetur adipisicing elit. Possimus, praesentium?</p>
                        <p>Provident consectetur natus voluptatem quis tenetur sed beatae eius sint.</p>
                        <button class="button">Click Here</button>
                    </div>
                </div>
            </a><a class="card" href="post/getAllpostsByBlock?block=5">
                <div class="front" style="background-image: url(resources/images/80.jpeg);">
                    <p>养生区</p>
                </div>
                <div class="back">
                    <div>
                        <p>Consectetur adipisicing elit. Possimus, praesentium?</p>
                        <p>Provident consectetur natus voluptatem quis tenetur sed beatae eius sint.</p>
                        <button class="button">Click Here</button>
                    </div>
                </div>
            </a><a class="card" href="post/getAllpostsByBlock?block=6">
                <div class="front" style="background-image: url(resources/images/91.jpeg);">
                    <p>旅游</p>
                </div>
                <div class="back">
                    <div>
                        <p>Consectetur adipisicing elit. Possimus, praesentium?</p>
                        <p>Provident consectetur natus voluptatem quis tenetur sed beatae eius sint.</p>
                        <button class="button">Click Here</button>
                    </div>
                </div>
            </a>
        </div>
        <script src="resoures/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
        <script src="resoures/mousewords.js"></script>
    </body>
</html>