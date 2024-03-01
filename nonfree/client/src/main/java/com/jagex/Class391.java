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

@OriginalClass("client!pj")
public class Class391 {

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	static final int anInt4753 = 0;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	public static final int anInt4754 = 1;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
	static final int anInt4755 = 3;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	static final int anInt4756 = 2;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "Ljava/applet/Applet;")
	static Applet anApplet1 = null;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Ljava/lang/String;")
	static String aString215 = null;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 18)
	Class391() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 23)
	public static void method27410(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet1 = arg0;
		aString215 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 23)
	public static void method27411(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet1 = arg0;
		aString215 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 23)
	public static void method27416(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		anApplet1 = arg0;
		aString215 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V", line = 32)
	public static void method27408(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class369.method26934(arg0, 3);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString215.startsWith("win") && !arg3) {
			Class369.method26934(arg0, 0);
			return;
		}
		if (aString215.startsWith("mac")) {
			Class361.method26768(arg0, 1, arg2);
			return;
		}
		Class369.method26934(arg0, 2);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V", line = 32)
	public static void method27412(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class369.method26934(arg0, 3);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString215.startsWith("win") && !arg3) {
			Class369.method26934(arg0, 0);
			return;
		}
		if (aString215.startsWith("mac")) {
			Class361.method26768(arg0, 1, arg2);
			return;
		}
		Class369.method26934(arg0, 2);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Z)V", line = 32)
	public static void method27413(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class369.method26934(arg0, 3);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (aString215.startsWith("win") && !arg3) {
			Class369.method26934(arg0, 0);
			return;
		}
		if (aString215.startsWith("mac")) {
			Class361.method26768(arg0, 1, arg2);
			return;
		}
		Class369.method26934(arg0, 2);
	}

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "(Ljava/lang/String;I)Z", line = 58)
	static boolean method27414(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class361.method26768(arg0, arg1, "openjs");
	}

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 62)
	public static boolean method27409(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString215.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(23) String local23 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
						if (local23.indexOf(arg0.charAt(local25)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(58) Throwable local58) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(80) Object local80 = Class588.method33290(anApplet1, arg2, new Object[] { (new URL(anApplet1.getCodeBase(), arg0)).toString() });
				return local80 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet1.getAppletContext().showDocument(new URL(anApplet1.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class588.method33291(anApplet1, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet1.getAppletContext().showDocument(new URL(anApplet1.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 62)
	public static boolean method27415(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString215.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(23) String local23 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
						if (local23.indexOf(arg0.charAt(local25)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(58) Throwable local58) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(80) Object local80 = Class588.method33290(anApplet1, arg2, new Object[] { (new URL(anApplet1.getCodeBase(), arg0)).toString() });
				return local80 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet1.getAppletContext().showDocument(new URL(anApplet1.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class588.method33291(anApplet1, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet1.getAppletContext().showDocument(new URL(anApplet1.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 62)
	public static boolean method27417(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString215.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(23) String local23 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
						if (local23.indexOf(arg0.charAt(local25)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(58) Throwable local58) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(80) Object local80 = Class588.method33290(anApplet1, arg2, new Object[] { (new URL(anApplet1.getCodeBase(), arg0)).toString() });
				return local80 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet1.getAppletContext().showDocument(new URL(anApplet1.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class588.method33291(anApplet1, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet1.getAppletContext().showDocument(new URL(anApplet1.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 62)
	public static boolean method27418(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			try {
				if (!aString215.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(23) String local23 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
						if (local23.indexOf(arg0.charAt(local25)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(58) Throwable local58) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(80) Object local80 = Class588.method33290(anApplet1, arg2, new Object[] { (new URL(anApplet1.getCodeBase(), arg0)).toString() });
				return local80 != null;
			} catch (@Pc(88) Throwable local88) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				anApplet1.getAppletContext().showDocument(new URL(anApplet1.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(106) Exception local106) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class588.method33291(anApplet1, "loggedout");
			} catch (@Pc(118) Throwable local118) {
			}
			try {
				anApplet1.getAppletContext().showDocument(new URL(anApplet1.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(131) Exception local131) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "gr", descriptor = "(Lclient!vs;I)V", line = 5235)
	static final void method27421(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class628.method33833(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "og", descriptor = "(Lclient!vs;I)V", line = 6716)
	static final void method27419(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class593.method33356(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "abd", descriptor = "(Lclient!vs;I)V", line = 9010)
	static final void method27420(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Exception_Sub5.method14670((char) local12) ? 1 : 0;
	}
}
