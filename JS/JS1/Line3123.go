package main

import "fmt"

func main() {
	fmt.Println("Little Message")

	fmt.Printf("これを見たら、私はこの世にいないということだ。\n" + "永遠に一緒にいることはできない。\n" + "きみがすきだ\n" + "また別の人生でお会いできることを願っています。\n")

	fmt.Println()

	for {
		var input string
		fmt.Print("Enter: ")
		fmt.Scanln(&input)

		if input != "あおい" && input != "つ" && input != "ゆな" && input != "ありがと" {
			fmt.Println("Invalid input, try again.")
		} else {
			break
		}
	}

	for {
		var num int
		fmt.Print("Enter a number (1-10) or 0 to exit: ")
		fmt.Scanln(&num)

		if num == 0 {
			fmt.Println("I see.")
			break
		}

		switch num {
		case 1:
			fmt.Println("I")
		case 2:
			fmt.Println("Want")
		case 3:
			fmt.Println("To")
		case 4:
			fmt.Println("See")
		case 5:
			fmt.Println("You")
		case 6:
			fmt.Println("Again")
		case 7:
			fmt.Println("Even")
		case 8:
			fmt.Println("If it only")
		case 9:
			fmt.Println("A")
		case 10:
			fmt.Println("Mere Second")
		default:
			fmt.Println("Invalid input. Please try again.")
		}
	}

	var count int = 11
	for {
		var num int
		fmt.Printf("Enter a number (%d+), or 0 to exit: ", count)
		fmt.Scanln(&num)

		if num == 0 {
			fmt.Println("Exiting...")
			break
		}

		if num < count {
			fmt.Printf("Please enter a number greater than %d.\n", count)
			continue
		}

		fmt.Println("I'll always love you.")
		break
	}

	fmt.Println("But for now, I must go.")
}
