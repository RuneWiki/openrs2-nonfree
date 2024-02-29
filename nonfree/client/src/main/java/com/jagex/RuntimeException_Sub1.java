package com.jagex;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asj")
public class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!asj", name = "v", descriptor = "I")
	public static int anInt3138;

	@OriginalMember(owner = "client!asj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString115;

	@OriginalMember(owner = "client!asj", name = "y", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!asj", name = "p", descriptor = "J")
	static long aLong209;

	@OriginalMember(owner = "client!asj", name = "w", descriptor = "Lclient!ru;")
	static Interface60 anInterface60_1 = null;

	@OriginalMember(owner = "client!asj", name = "q", descriptor = "Ljava/lang/String;")
	String aString116;

	@OriginalMember(owner = "client!asj", name = "x", descriptor = "Ljava/lang/Throwable;")
	Throwable aThrowable1;

	@OriginalMember(owner = "client!asj", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 30)
	RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString116 = arg1;
		this.aThrowable1 = arg0;
		this.initCause(arg0);
	}

	@OriginalMember(owner = "client!asj", name = "w", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V", line = 38)
	public static void method23135(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class475.method29689(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class352.method27911(local1);
			local1 = Class283.method26700(local1);
			@Pc(38) URL local38 = null;
			if (anApplet1 != null) {
				local38 = anApplet1.getCodeBase();
			} else if (anInterface60_1 != null) {
				local38 = anInterface60_1.method30575();
			}
			if (local38 == null) {
				return;
			}
			@Pc(58) String local58 = "Unknown";
			@Pc(60) String local60 = "1.1";
			try {
				local58 = System.getProperty("java.vendor");
				local60 = System.getProperty("java.version");
			} catch (@Pc(68) Exception local68) {
			}
			@Pc(124) URL local124 = new URL(local38, "clienterror.ws?c=" + anInt3138 * 1141119879 + "&cs=" + Class26.anInt123 * 855690843 + "&u=" + (aString115 == null ? "" + aLong209 * 2640931341331960365L : Class283.method26700(aString115)) + "&v1=" + Class283.method26700(local58) + "&v2=" + Class283.method26700(local60) + "&e=" + local1);
			@Pc(130) DataInputStream local130 = new DataInputStream(local124.openStream());
			local130.read();
			local130.close();
		} catch (@Pc(137) Exception local137) {
			local137.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!asj", name = "q", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V", line = 38)
	public static void method23136(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class475.method29689(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class352.method27911(local1);
			local1 = Class283.method26700(local1);
			@Pc(38) URL local38 = null;
			if (anApplet1 != null) {
				local38 = anApplet1.getCodeBase();
			} else if (anInterface60_1 != null) {
				local38 = anInterface60_1.method30575();
			}
			if (local38 == null) {
				return;
			}
			@Pc(58) String local58 = "Unknown";
			@Pc(60) String local60 = "1.1";
			try {
				local58 = System.getProperty("java.vendor");
				local60 = System.getProperty("java.version");
			} catch (@Pc(68) Exception local68) {
			}
			@Pc(124) URL local124 = new URL(local38, "clienterror.ws?c=" + anInt3138 * 1141119879 + "&cs=" + Class26.anInt123 * 855690843 + "&u=" + (aString115 == null ? "" + aLong209 * 2640931341331960365L : Class283.method26700(aString115)) + "&v1=" + Class283.method26700(local58) + "&v2=" + Class283.method26700(local60) + "&e=" + local1);
			@Pc(130) DataInputStream local130 = new DataInputStream(local124.openStream());
			local130.read();
			local130.close();
		} catch (@Pc(137) Exception local137) {
			local137.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!asj", name = "t", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V", line = 38)
	public static void method23137(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class475.method29689(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class352.method27911(local1);
			local1 = Class283.method26700(local1);
			@Pc(38) URL local38 = null;
			if (anApplet1 != null) {
				local38 = anApplet1.getCodeBase();
			} else if (anInterface60_1 != null) {
				local38 = anInterface60_1.method30575();
			}
			if (local38 == null) {
				return;
			}
			@Pc(58) String local58 = "Unknown";
			@Pc(60) String local60 = "1.1";
			try {
				local58 = System.getProperty("java.vendor");
				local60 = System.getProperty("java.version");
			} catch (@Pc(68) Exception local68) {
			}
			@Pc(124) URL local124 = new URL(local38, "clienterror.ws?c=" + anInt3138 * 1141119879 + "&cs=" + Class26.anInt123 * 855690843 + "&u=" + (aString115 == null ? "" + aLong209 * 2640931341331960365L : Class283.method26700(aString115)) + "&v1=" + Class283.method26700(local58) + "&v2=" + Class283.method26700(local60) + "&e=" + local1);
			@Pc(130) DataInputStream local130 = new DataInputStream(local124.openStream());
			local130.read();
			local130.close();
		} catch (@Pc(137) Exception local137) {
			local137.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!asj", name = "d", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!asj;", line = 75)
	public static RuntimeException_Sub1 method23138(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString116 = local5.aString116 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!asj", name = "x", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!asj;", line = 75)
	public static RuntimeException_Sub1 method23139(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString116 = local5.aString116 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!asj", name = "r", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!asj;", line = 75)
	public static RuntimeException_Sub1 method23140(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString116 = local5.aString116 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!asj", name = "s", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!asj;", line = 75)
	public static RuntimeException_Sub1 method23141(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString116 = local5.aString116 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!asj", name = "g", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;", line = 85)
	static String method23142(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString116 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(30) PrintWriter local30 = new PrintWriter(local25);
		arg0.printStackTrace(local30);
		local30.close();
		@Pc(38) String local38 = local25.toString();
		@Pc(46) BufferedReader local46 = new BufferedReader(new StringReader(local38));
		@Pc(49) String local49 = local46.readLine();
		while (true) {
			@Pc(52) String local52 = local46.readLine();
			if (local52 == null) {
				return local15 + "| " + local49;
			}
			@Pc(60) int local60 = local52.indexOf(40);
			@Pc(67) int local67 = local52.indexOf(41, local60 + 1);
			@Pc(75) String local75;
			if (local60 == -1) {
				local75 = local52;
			} else {
				local75 = local52.substring(0, local60);
			}
			local75 = local75.trim();
			local75 = local75.substring(local75.lastIndexOf(32) + 1);
			local75 = local75.substring(local75.lastIndexOf(9) + 1);
			local15 = local15 + local75;
			if (local60 != -1 && local67 != -1) {
				@Pc(117) int local117 = local52.indexOf(".java:", local60);
				if (local117 >= 0) {
					local15 = local15 + local52.substring(local117 + 5, local67);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "client!asj", name = "j", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;", line = 85)
	static String method23143(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString116 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(30) PrintWriter local30 = new PrintWriter(local25);
		arg0.printStackTrace(local30);
		local30.close();
		@Pc(38) String local38 = local25.toString();
		@Pc(46) BufferedReader local46 = new BufferedReader(new StringReader(local38));
		@Pc(49) String local49 = local46.readLine();
		while (true) {
			@Pc(52) String local52 = local46.readLine();
			if (local52 == null) {
				return local15 + "| " + local49;
			}
			@Pc(60) int local60 = local52.indexOf(40);
			@Pc(67) int local67 = local52.indexOf(41, local60 + 1);
			@Pc(75) String local75;
			if (local60 == -1) {
				local75 = local52;
			} else {
				local75 = local52.substring(0, local60);
			}
			local75 = local75.trim();
			local75 = local75.substring(local75.lastIndexOf(32) + 1);
			local75 = local75.substring(local75.lastIndexOf(9) + 1);
			local15 = local15 + local75;
			if (local60 != -1 && local67 != -1) {
				@Pc(117) int local117 = local52.indexOf(".java:", local60);
				if (local117 >= 0) {
					local15 = local15 + local52.substring(local117 + 5, local67);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "client!asj", name = "z", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;", line = 85)
	static String method23144(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString116 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(30) PrintWriter local30 = new PrintWriter(local25);
		arg0.printStackTrace(local30);
		local30.close();
		@Pc(38) String local38 = local25.toString();
		@Pc(46) BufferedReader local46 = new BufferedReader(new StringReader(local38));
		@Pc(49) String local49 = local46.readLine();
		while (true) {
			@Pc(52) String local52 = local46.readLine();
			if (local52 == null) {
				return local15 + "| " + local49;
			}
			@Pc(60) int local60 = local52.indexOf(40);
			@Pc(67) int local67 = local52.indexOf(41, local60 + 1);
			@Pc(75) String local75;
			if (local60 == -1) {
				local75 = local52;
			} else {
				local75 = local52.substring(0, local60);
			}
			local75 = local75.trim();
			local75 = local75.substring(local75.lastIndexOf(32) + 1);
			local75 = local75.substring(local75.lastIndexOf(9) + 1);
			local15 = local15 + local75;
			if (local60 != -1 && local67 != -1) {
				@Pc(117) int local117 = local52.indexOf(".java:", local60);
				if (local117 >= 0) {
					local15 = local15 + local52.substring(local117 + 5, local67);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "client!asj", name = "i", descriptor = "(Ljava/lang/String;)V", line = 123)
	static final void method23145(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Class474.method29677(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!asj", name = "k", descriptor = "(Ljava/lang/String;)V", line = 123)
	static final void method23146(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Class474.method29677(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!asj", name = "u", descriptor = "(Ljava/lang/String;)V", line = 123)
	static final void method23147(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Class474.method29677(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!asj", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 127)
	static final String method23148(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}
}
