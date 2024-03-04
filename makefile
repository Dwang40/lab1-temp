usage:
	echo "read directions"
frequency: Main.java
	javac Main.java
	java Main Freq $(ARGS)
distance: Main.java
	javac Main.java
	java Main distance $(ARGS)
decode: Main.java
	javac Main.java
	java Main decode $(ARGS)