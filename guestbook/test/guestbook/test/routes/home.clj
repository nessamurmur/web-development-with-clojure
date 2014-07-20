(ns guestbook.test.routes.home
  (:use clojure.test
         guestbook.routes.home))

(deftest test-format-time
  (testing "format-time"
    (is (=  "07/01/1970" (format-time  614563200)))))
