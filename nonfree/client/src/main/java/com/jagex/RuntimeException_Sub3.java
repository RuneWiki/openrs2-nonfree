package com.jagex;

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

@OriginalClass("client!any")
public class RuntimeException_Sub3 extends RuntimeException {

	@OriginalMember(owner = "client!any", name = "g", descriptor = "I")
	public static int anInt2805;

	@OriginalMember(owner = "client!any", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString121;

	@OriginalMember(owner = "client!any", name = "x", descriptor = "Ljava/lang/String;")
	String aString122;

	@OriginalMember(owner = "client!any", name = "s", descriptor = "Ljava/lang/Throwable;")
	Throwable aThrowable1;

	@OriginalMember(owner = "client!any", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 29)
	RuntimeException_Sub3(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString122 = arg1;
		this.aThrowable1 = arg0;
		this.initCause(arg0);
	}

	@OriginalMember(owner = "client!any", name = "x", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V", line = 37)
	public static void method20481(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class62_Sub1.method12871(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class13_Sub12.method16901(local1);
			local1 = Class476.method28797(local1);
			if (Class632.anApplet3 == null) {
				return;
			}
			@Pc(43) String local43 = "Unknown";
			@Pc(45) String local45 = "1.1";
			try {
				local43 = System.getProperty("java.vendor");
				local45 = System.getProperty("java.version");
			} catch (@Pc(53) Exception local53) {
			}
			@Pc(111) URL local111 = new URL(Class632.anApplet3.getCodeBase(), "clienterror.ws?c=" + anInt2805 * -478844565 + "&cs=" + Class291.anInt4370 * 607315527 + "&u=" + (aString121 == null ? "" + RuntimeException_Sub1.aLong192 * 3362612962830757259L : Class476.method28797(aString121)) + "&v1=" + Class476.method28797(local43) + "&v2=" + Class476.method28797(local45) + "&e=" + local1);
			@Pc(117) DataInputStream local117 = new DataInputStream(local111.openStream());
			local117.read();
			local117.close();
		} catch (@Pc(124) Exception local124) {
			local124.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!any", name = "s", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V", line = 37)
	public static void method20487(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class62_Sub1.method12871(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class13_Sub12.method16901(local1);
			local1 = Class476.method28797(local1);
			if (Class632.anApplet3 == null) {
				return;
			}
			@Pc(43) String local43 = "Unknown";
			@Pc(45) String local45 = "1.1";
			try {
				local43 = System.getProperty("java.vendor");
				local45 = System.getProperty("java.version");
			} catch (@Pc(53) Exception local53) {
			}
			@Pc(111) URL local111 = new URL(Class632.anApplet3.getCodeBase(), "clienterror.ws?c=" + anInt2805 * -478844565 + "&cs=" + Class291.anInt4370 * 607315527 + "&u=" + (aString121 == null ? "" + RuntimeException_Sub1.aLong192 * 3362612962830757259L : Class476.method28797(aString121)) + "&v1=" + Class476.method28797(local43) + "&v2=" + Class476.method28797(local45) + "&e=" + local1);
			@Pc(117) DataInputStream local117 = new DataInputStream(local111.openStream());
			local117.read();
			local117.close();
		} catch (@Pc(124) Exception local124) {
			local124.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!any", name = "u", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!any;", line = 67)
	public static RuntimeException_Sub3 method20482(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub3 local5;
		if (arg0 instanceof RuntimeException_Sub3) {
			local5 = (RuntimeException_Sub3) arg0;
			local5.aString122 = local5.aString122 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub3(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!any", name = "y", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;", line = 77)
	static String method20483(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub3) {
			@Pc(5) RuntimeException_Sub3 local5 = (RuntimeException_Sub3) arg0;
			local15 = local5.aString122 + " | ";
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

	@OriginalMember(owner = "client!any", name = "b", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;", line = 77)
	static String method20485(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub3) {
			@Pc(5) RuntimeException_Sub3 local5 = (RuntimeException_Sub3) arg0;
			local15 = local5.aString122 + " | ";
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

	@OriginalMember(owner = "client!any", name = "c", descriptor = "(Ljava/lang/String;)V", line = 115)
	static final void method20484(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Class242.method24752(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!any", name = "j", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 119)
	static final String method20480(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!any", name = "z", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 119)
	static final String method20486(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!any", name = "n", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 119)
	static final String method20488(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}
}
