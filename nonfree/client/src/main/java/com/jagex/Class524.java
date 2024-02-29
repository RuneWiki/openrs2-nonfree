package com.jagex;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ry")
public class Class524 {

	@OriginalMember(owner = "client!ry", name = "y", descriptor = "I")
	static final int anInt5157 = 2;

	@OriginalMember(owner = "client!ry", name = "v", descriptor = "I")
	static final int anInt5158 = 0;

	@OriginalMember(owner = "client!ry", name = "l", descriptor = "I")
	public static final int anInt5159 = 1;

	@OriginalMember(owner = "client!ry", name = "w", descriptor = "I")
	static final int anInt5160 = 3;

	@OriginalMember(owner = "client!ry", name = "dm", descriptor = "Lclient!ara;")
	static Class77_Sub1_Sub8 aClass77_Sub1_Sub8_4;

	@OriginalMember(owner = "client!ry", name = "p", descriptor = "Ljava/applet/Applet;")
	static Applet anApplet3 = null;

	@OriginalMember(owner = "client!ry", name = "c", descriptor = "Ljava/lang/String;")
	static String aString226 = null;

	@OriginalMember(owner = "client!ry", name = "<init>", descriptor = "()V", line = 18)
	Class524() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ry", name = "w", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 23)
	public static void method30626(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet3 = arg0;
		aString226 = arg1;
	}

	@OriginalMember(owner = "client!ry", name = "t", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 23)
	public static void method30627(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet3 = arg0;
		aString226 = arg1;
	}

	@OriginalMember(owner = "client!ry", name = "q", descriptor = "(Ljava/lang/String;ZZ)V", line = 28)
	public static void method30628(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		Class413.method28592(arg0, arg1, "openjs", arg2);
	}

	@OriginalMember(owner = "client!ry", name = "x", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V", line = 32)
	public static void method30629(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class460.method29520(arg0, 3);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString226.startsWith("win") && !arg3) {
			Class460.method29520(arg0, 0);
			return;
		}
		if (aString226.startsWith("mac")) {
			Class244.method26113(arg0, 1, arg2);
			return;
		}
		Class460.method29520(arg0, 2);
	}

	@OriginalMember(owner = "client!ry", name = "d", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V", line = 32)
	public static void method30630(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class460.method29520(arg0, 3);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString226.startsWith("win") && !arg3) {
			Class460.method29520(arg0, 0);
			return;
		}
		if (aString226.startsWith("mac")) {
			Class244.method26113(arg0, 1, arg2);
			return;
		}
		Class460.method29520(arg0, 2);
	}

	@OriginalMember(owner = "client!ry", name = "z", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 62)
	public static boolean method30631(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString226.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(24) String local24 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
						if (local24.indexOf(arg0.charAt(local26)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(59) Throwable local59) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(81) Object local81 = Class31.method522(anApplet3, arg2, new Object[] { (new URL(anApplet3.getCodeBase(), arg0)).toString() });
				return local81 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class31.method519(anApplet3, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ry", name = "r", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 62)
	public static boolean method30632(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString226.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(24) String local24 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
						if (local24.indexOf(arg0.charAt(local26)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(59) Throwable local59) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(81) Object local81 = Class31.method522(anApplet3, arg2, new Object[] { (new URL(anApplet3.getCodeBase(), arg0)).toString() });
				return local81 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class31.method519(anApplet3, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ry", name = "g", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 62)
	public static boolean method30633(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString226.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(24) String local24 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
						if (local24.indexOf(arg0.charAt(local26)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(59) Throwable local59) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(81) Object local81 = Class31.method522(anApplet3, arg2, new Object[] { (new URL(anApplet3.getCodeBase(), arg0)).toString() });
				return local81 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class31.method519(anApplet3, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ry", name = "s", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 62)
	public static boolean method30634(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString226.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(24) String local24 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
						if (local24.indexOf(arg0.charAt(local26)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(59) Throwable local59) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(81) Object local81 = Class31.method522(anApplet3, arg2, new Object[] { (new URL(anApplet3.getCodeBase(), arg0)).toString() });
				return local81 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class31.method519(anApplet3, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet3.getAppletContext().showDocument(new URL(anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ry", name = "g", descriptor = "(I)V", line = 206)
	static void method30635() {
		Class589.aString235 = "";
		Class589.aString233 = "";
		Class589.aString234 = "";
		Class589.aBoolean813 = true;
	}

	@OriginalMember(owner = "client!ry", name = "rh", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 7765)
	static final void method30636(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(12) int local12 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		@Pc(27) int local27 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307] - 1;
		@Pc(29) int local29 = local27;
		if (arg0.anInt3888 * -1866862435 != 6 && arg0.anInt3888 * -1866862435 != 2) {
			throw new RuntimeException("");
		}
		@Pc(55) Class333 local55 = (Class333) Class578.aClass35_Sub3_1.method18319(arg0.anInt3889 * 939166901);
		if (arg0.aClass328_2 == null) {
			arg0.aClass328_2 = new Class328(local55, arg0.anInt3888 * -1866862435 == 6);
		}
		arg0.aClass328_2.aLong257 = Class244.method26114() * 8855449811293583851L;
		if (local55.aByteArray78 != null) {
			if (local27 < 0 || local27 >= local55.aByteArray78.length) {
				throw new RuntimeException("");
			}
			local29 = local55.aByteArray78[local27];
		}
		if (local55.aShortArray119 == null || local29 < 0 || local29 >= local55.aShortArray119.length) {
			throw new RuntimeException("");
		}
		arg0.aClass328_2.aShortArray115[local29] = (short) local12;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!ry", name = "kt", descriptor = "(Lclient!gh;Lclient!gm;I)V", line = 10833)
	public static void method30637(@OriginalArg(0) Class273 arg0, @OriginalArg(1) Class277 arg1) {
		@Pc(4) Class277 local4 = Class578.method31654(arg0, arg1);
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (local4 == null) {
			local10 = Class149_Sub4.anInt2368 * 1771907305;
			local14 = Class19.anInt108 * -1091172141;
		} else {
			local10 = local4.anInt3874 * -881188269;
			local14 = local4.anInt3875 * -1279656873;
		}
		Class91.method18663(arg1, local10, local14, false);
		Class536.method30850(arg1, local10, local14);
	}

	@OriginalMember(owner = "client!ry", name = "aic", descriptor = "(Lclient!yf;I)V", line = 10890)
	static final void method30638(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class136_Sub1.aBoolean345 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ry", name = "ajj", descriptor = "(Lclient!yf;I)V", line = 11088)
	static final void method30639(@OriginalArg(0) Class665 arg0) {
		@Pc(13) CharSequence local13 = (CharSequence) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class283.method26700(local13);
	}

	@OriginalMember(owner = "client!ry", name = "ayj", descriptor = "(Lclient!yf;B)V", line = 13616)
	static final void method30640(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class504.anInt3362 * 1720947399;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class504.anInt3362 * 1720947399;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
	}
}
