## 開発環境
フロントエンド  
React  
typescript  

ライブラリ)  
React Router  


バックエンド  
Kotlin  

## 概要
・Web Clieにおけるサンプルテンプレート  

・F設計の考え方(※今2022/09/03現在)  
repositoty層・・・外部との通信。BEとはこちらで_JSON形式にてe2e通信を行う。  
store層・・・repositoty層からきたオブジェクトの格納先。store→domaiに変換してやる  
domain層・・・ビジネスロジック・ユースケースに必要なドメインオブジェクトの格納先  
feature層・・・各ページのUI系を管理  

・BE設計の考え方(※今2022/09/03現在)  
controller層・・・e2e通信の入出力先（JSON形式）  
model層・・・e2eで必要なオブジェクトの格納先  
usecase層・・・ビジネスロジックを実装するレイアー    
domain層・・・ビジネスロジック・ユースケースに必要なドメインオブジェクトの格納先  
service層・・・DB、API等の外部との接続先  

https://baigie.me/engineerblog/?p=348

こっちの方が好きかも)  
https://qiita.com/Sotq_17/items/7c7ab9880597336b3ee5

## 環境構築
### プロジェクトの作成

npx create-react-app {作成するプロジェクト名}  

※今回はtypescriptにてPJを作成するので--template typescriptを使用して、  
tyopscript製のPJを作成する  
例）npx create-react-app --template typescript web-client  


### 各モジュール・ライブラリの導入
#### 画面遷移

React Routerを導入する  
[ドキュメント](https://reactrouter.com/en/main)  

npm install react-router-dom  

参考記事）  
https://qiita.com/YSasago/items/f00333b60a2b01be4bb7

https://zenn.dev/nakashi94/articles/97408c37781a17

#### HTTPクライアントライブラリ

axiosを導入する   

npm install axios   

参考記事）   
https://www.freecodecamp.org/japanese/news/how-to-use-axios-with-react/



