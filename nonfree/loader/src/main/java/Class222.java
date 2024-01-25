import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!am")
public final class Class222 implements Runnable {

	@OriginalMember(owner = "loader!am", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString383;

	@OriginalMember(owner = "loader!am", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString385;

	@OriginalMember(owner = "loader!am", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString386;

	@OriginalMember(owner = "loader!am", name = "w", descriptor = "Ljava/lang/String;")
	private static String aString387;

	@OriginalMember(owner = "loader!am", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString388;

	@OriginalMember(owner = "loader!am", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString389;

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString390;

	@OriginalMember(owner = "loader!am", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!am", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!am", name = "k", descriptor = "I")
	private static final int anInt6627 = 1;

	@OriginalMember(owner = "loader!am", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "loader!am", name = "v", descriptor = "J")
	private static volatile long aLong219 = 0L;

	@OriginalMember(owner = "loader!am", name = "o", descriptor = "Lloader!ie;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!am", name = "j", descriptor = "Lloader!ep;")
	private Class225 aClass225_1 = null;

	@OriginalMember(owner = "loader!am", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!am", name = "c", descriptor = "Lloader!le;")
	private Class227 aClass227_2 = null;

	@OriginalMember(owner = "loader!am", name = "y", descriptor = "Lloader!ep;")
	private Class225 aClass225_2 = null;

	@OriginalMember(owner = "loader!am", name = "s", descriptor = "Lloader!le;")
	private Class227 aClass227_1 = null;

	@OriginalMember(owner = "loader!am", name = "e", descriptor = "Lloader!le;")
	private Class227 aClass227_3 = null;

	@OriginalMember(owner = "loader!am", name = "z", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "loader!am", name = "h", descriptor = "I")
	private final int anInt6626;

	@OriginalMember(owner = "loader!am", name = "i", descriptor = "Ljava/lang/String;")
	private String aString384;

	@OriginalMember(owner = "loader!am", name = "p", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!am", name = "d", descriptor = "[Lloader!le;")
	private Class227[] aClass227Array1;

	@OriginalMember(owner = "loader!am", name = "r", descriptor = "Lloader!a;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "loader!am", name = "x", descriptor = "Lloader!g;")
	private Class226 aClass226_1;

	@OriginalMember(owner = "loader!am", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!le;")
	private static Class227 method5848(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) String local13;
		if (arg1 == 33) {
			local13 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local13 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local13 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString387, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			@Pc(85) String local85 = local75[local77];
			if (local85.length() <= 0 || (new File(local85)).exists()) {
				try {
					return new Class227(new File(local85, local13), "rw", 10000L);
				} catch (@Pc(109) Exception local109) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)Ljava/io/File;")
	private static File method5855(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(54) String[] local54 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString387, "/tmp/", "" };
		@Pc(79) String[] local79 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(86) int local86 = 0; local86 < local79.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local54.length; local92++) {
					@Pc(130) String local130 = local54[local92] + local79[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local81 != 0 || local137.exists()) {
							@Pc(148) String local148 = local54[local92];
							if (local81 != 1 || local148.length() <= 0 || (new File(local148)).exists()) {
								(new File(local54[local92] + local79[local86])).mkdir();
								if (arg1 != null) {
									(new File(local54[local92] + local79[local86] + "/" + arg1)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(216) int local216 = local132.read();
								local132.seek(0L);
								local132.write(local216);
								local132.seek(0L);
								local132.close();
								aHashtable1.put(arg2, local137);
								return local137;
							}
						}
					} catch (@Pc(235) Exception local235) {
						try {
							if (local132 != null) {
								local132.close();
							}
						} catch (@Pc(245) Exception local245) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!am", name = "b", descriptor = "(IILjava/lang/String;)Lloader!le;")
	private static Class227 method5867(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(20) String local20;
		if (arg0 == 33) {
			local20 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local20 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local20 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(79) String[] local79 = new String[] { "c:/rscache/", "/rscache/", aString387, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(89) int local89 = 0; local89 < local79.length; local89++) {
			@Pc(101) String local101 = local79[local89];
			if (local101.length() <= 0 || (new File(local101)).exists()) {
				try {
					return new Class227(new File(local101, local20), "rw", 10000L);
				} catch (@Pc(127) Exception local127) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!am", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class222(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet2 = arg0;
		aString383 = "Unknown";
		aString386 = "1.1";
		this.anInt6626 = arg1;
		this.aString384 = arg2;
		try {
			aString383 = System.getProperty("java.vendor");
			aString386 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString389 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString389 = "Unknown";
		}
		aString385 = aString389.toLowerCase();
		try {
			aString388 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString388 = "";
		}
		try {
			aString390 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString390 = "";
		}
		try {
			aString387 = System.getProperty("user.home");
			if (aString387 != null) {
				aString387 = aString387 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString387 == null) {
			aString387 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass227_3 = new Class227(method5855(this.anInt6626, null, "random.dat"), "rw", 25L);
		this.aClass227_1 = new Class227(this.method5852("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass227_2 = new Class227(this.method5852("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass227Array1 = new Class227[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass227Array1[local194] = new Class227(this.method5852("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass221_1 = new Class221();
		} catch (@Pc(230) Throwable local230) {
		}
		try {
			this.aClass226_1 = new Class226();
		} catch (@Pc(237) Throwable local237) {
		}
		@Pc(240) ThreadGroup local240 = Thread.currentThread().getThreadGroup();
		for (@Pc(243) ThreadGroup local243 = local240.getParent(); local243 != null; local243 = local243.getParent()) {
			local240 = local243;
		}
		@Pc(255) Thread[] local255 = new Thread[1000];
		local240.enumerate(local255);
		for (@Pc(261) int local261 = 0; local261 < local255.length; local261++) {
			if (local255[local261] != null && local255[local261].getName().startsWith("AWT")) {
				local255[local261].setPriority(1);
			}
		}
		this.aBoolean490 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!ep;")
	private Class225 method5843(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 < 7 ? (Class225) null : this.method5873(0, (byte) -28, arg0, 11, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!ep;")
	private Class225 method5844(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		return arg0 >= -125 ? (Class225) null : this.method5873(0, (byte) -28, arg1, 10, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Lloader!ep;")
	private Class225 method5845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		if (arg0 >= -102) {
			this.aString384 = null;
		}
		return this.method5873(arg1, (byte) -28, new Object[] { arg2, arg5, arg3 }, 17, arg4);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!ep;")
	private Class225 method5846(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 0) {
			this.aClass227_3 = null;
		}
		return this.method5873(0, (byte) -28, arg1, 7, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!ep;")
	private Class225 method5847(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -79) {
			this.aClass227Array1 = null;
		}
		return this.method5873(0, (byte) -28, arg0, 21, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!ep;")
	private Class225 method5849(@OriginalArg(0) Transferable arg0) {
		return this.method5873(0, (byte) -28, arg0, 19, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!ep;")
	private Class225 method5850(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 19) {
			this.method5845(105, -46, null, null, 55, null);
		}
		return this.method5873(0, (byte) -28, arg1, 20, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(I)Z")
	private boolean method5851(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass227Array1 = null;
		}
		return this.aClass221_1 != null;
	}

	@OriginalMember(owner = "loader!am", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class225 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean490) {
						return;
					}
					if (this.aClass225_1 != null) {
						local17 = this.aClass225_1;
						this.aClass225_1 = this.aClass225_1.aClass225_3;
						if (this.aClass225_1 == null) {
							this.aClass225_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local17.anInt6634;
				if (local45 == 1) {
					if (aLong219 > Class228.method5906()) {
						throw new IOException();
					}
					local17.anObject9 = new Socket(InetAddress.getByName((String) local17.anObject10), local17.anInt6632);
				} else if (local45 == 2) {
					@Pc(854) Thread local854 = new Thread((Runnable) local17.anObject10);
					local854.setDaemon(true);
					local854.start();
					local854.setPriority(local17.anInt6632);
					local17.anObject9 = local854;
				} else if (local45 == 4) {
					if (Class228.method5906() < aLong219) {
						throw new IOException();
					}
					local17.anObject9 = new DataInputStream(((URL) local17.anObject10).openStream());
				} else {
					@Pc(84) Object[] local84;
					if (local45 == 8) {
						local84 = (Object[]) local17.anObject10;
						if (((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local84[0]).getDeclaredMethod((String) local84[1], (Class[]) local84[2]);
					} else if (local45 == 9) {
						local84 = (Object[]) local17.anObject10;
						if (((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local84[0]).getDeclaredField((String) local84[1]);
					} else if (local45 == 18) {
						@Pc(123) Clipboard local123 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject9 = local123.getContents(null);
					} else if (local45 == 19) {
						@Pc(811) Transferable local811 = (Transferable) local17.anObject10;
						@Pc(814) Clipboard local814 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local814.setContents(local811, null);
					} else {
						@Pc(187) String local187;
						if (local45 == 3) {
							if (Class228.method5906() < aLong219) {
								throw new IOException();
							}
							local187 = (local17.anInt6632 >> 24 & 0xFF) + "." + (local17.anInt6632 >> 16 & 0xFF) + "." + (local17.anInt6632 >> 8 & 0xFF) + "." + (local17.anInt6632 & 0xFF);
							local17.anObject9 = InetAddress.getByName(local187).getHostName();
						} else if (local45 == 21) {
							if (aLong219 > Class228.method5906()) {
								throw new IOException();
							}
							local17.anObject9 = InetAddress.getByName((String) local17.anObject10).getAddress();
						} else if (local45 == 5) {
							local17.anObject9 = this.aClass221_1.method5842();
						} else if (local45 == 6) {
							@Pc(235) Frame local235 = new Frame("Jagex Full Screen");
							local17.anObject9 = local235;
							local235.setResizable(false);
							this.aClass221_1.method5841(local17.anInt6632 >>> 16, local235, local17.anInt6635 & 0xFFFF, local17.anInt6632 & 0xFFFF, local17.anInt6635 >> 16);
						} else if (local45 == 7) {
							this.aClass221_1.method5840();
						} else {
							@Pc(400) Method local400;
							@Pc(392) Class[] local392;
							@Pc(394) Runtime local394;
							if (local45 == 10) {
								local392 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local394 = Runtime.getRuntime();
								if (!aString385.startsWith("mac")) {
									local400 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local392);
									local400.setAccessible(true);
									local400.invoke(local394, local17.anObject10, "jawt");
									local400.setAccessible(false);
								}
								local400 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local392);
								local400.setAccessible(true);
								if (aString385.startsWith("linux") || aString385.startsWith("sunos")) {
									local400.invoke(local394, local17.anObject10, this.method5852("libjaggl_dri.so").toString());
									@Pc(707) Class local707 = ((Class) local17.anObject10).getClassLoader().loadClass("jaggl.X11.dri");
									local707.getMethod("bind").invoke(null);
									local400.invoke(local394, local17.anObject10, this.method5852("libjaggl.so").toString());
									local707.getMethod("close").invoke(null);
								} else if (aString385.startsWith("mac")) {
									local400.invoke(local394, local17.anObject10, this.method5852("libjaggl.jnilib").toString());
								} else if (aString385.startsWith("win")) {
									local400.invoke(local394, local17.anObject10, this.method5852("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local400.setAccessible(false);
							} else {
								@Pc(294) int local294;
								if (local45 == 11) {
									@Pc(281) Field local281 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local281.setAccessible(true);
									@Pc(292) Vector local292 = (Vector) local281.get(((Class) local17.anObject10).getClassLoader());
									for (local294 = 0; local292.size() > local294; local294++) {
										@Pc(302) Object local302 = local292.elementAt(local294);
										@Pc(309) Method local309 = local302.getClass().getDeclaredMethod("finalize");
										local309.setAccessible(true);
										local309.invoke(local302);
										local309.setAccessible(false);
										@Pc(326) Field local326 = local302.getClass().getDeclaredField("handle");
										local326.setAccessible(true);
										local326.set(local302, Integer.valueOf(0));
										local326.setAccessible(false);
									}
									local281.setAccessible(false);
								} else {
									@Pc(602) Class227 local602;
									if (local45 == 12) {
										local602 = method5848(this.aString384, this.anInt6626);
										local17.anObject9 = local602;
									} else if (local45 == 13) {
										local602 = method5867(this.anInt6626, this.aString384);
										local17.anObject9 = local602;
									} else if (local45 == 14) {
										@Pc(585) int local585 = local17.anInt6632;
										@Pc(588) int local588 = local17.anInt6635;
										this.aClass226_1.method5883(local588, local585);
									} else if (local45 == 15) {
										@Pc(571) boolean local571 = local17.anInt6632 != 0;
										@Pc(575) Component local575 = (Component) local17.anObject10;
										this.aClass226_1.method5882(local575, local571);
									} else if (local45 == 17) {
										local84 = (Object[]) local17.anObject10;
										this.aClass226_1.method5884((Component) local84[0], (int[]) local84[1], local17.anInt6635, local17.anInt6632, (Point) local84[2]);
									} else if (local45 == 16) {
										try {
											if (!aString385.startsWith("win")) {
												throw new Exception();
											}
											local187 = (String) local17.anObject10;
											if (!local187.startsWith("http://") && !local187.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(491) String local491 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local294 = 0; local294 < local187.length(); local294++) {
												if (local491.indexOf(local187.charAt(local294)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local187 + "\"");
											local17.anObject9 = null;
										} catch (@Pc(533) Exception local533) {
											local17.anObject9 = local533;
										}
									} else if (local45 == 20) {
										try {
											local392 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local394 = Runtime.getRuntime();
											local400 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local392);
											local400.setAccessible(true);
											if (aString385.startsWith("win")) {
												if (aString388.startsWith("amd64") || aString388.startsWith("x86_64")) {
													local400.invoke(local394, local17.anObject10, this.method5852("jagmisc64.dll").toString());
												} else {
													local400.invoke(local394, local17.anObject10, this.method5852("jagmisc.dll").toString());
												}
											}
											local400.setAccessible(false);
										} catch (@Pc(459) Throwable local459) {
											local17.anObject9 = local459;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local17.anInt6633 = 1;
			} catch (@Pc(893) ThreadDeath local893) {
				throw local893;
			} catch (@Pc(896) Throwable local896) {
				local17.anInt6633 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method5852(@OriginalArg(1) String arg0) {
		return method5855(this.anInt6626, this.aString384, arg0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lloader!ep;")
	private Class225 method5853(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class225 local3 = new Class225();
		synchronized (local3) {
			local3.anInt6632 = arg4;
			local3.anObject10 = arg0;
			local3.anInt6634 = arg2;
			local3.anInt6635 = arg3;
			synchronized (this) {
				if (this.aClass225_2 == null) {
					this.aClass225_2 = this.aClass225_1 = local3;
				} else {
					this.aClass225_2.aClass225_3 = local3;
					this.aClass225_2 = local3;
				}
				this.notify();
			}
			if (arg1 > -113) {
				return (Class225) null;
			}
			try {
				local3.wait();
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(Z)Lloader!ep;")
	private Class225 method5854(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.method5873(0, (byte) -28, null, 13, 0) : (Class225) null;
	}

	@OriginalMember(owner = "loader!am", name = "c", descriptor = "(I)V")
	private void method5856(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			this.run();
		}
		synchronized (this) {
			this.aBoolean490 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass227_1 != null) {
			try {
				this.aClass227_1.method5895();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass227_2 != null) {
			try {
				this.aClass227_2.method5895();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass227Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass227Array1.length; local53++) {
				if (this.aClass227Array1[local53] != null) {
					try {
						this.aClass227Array1[local53].method5895();
					} catch (@Pc(76) IOException local76) {
					}
				}
			}
		}
		if (this.aClass227_3 != null) {
			try {
				this.aClass227_3.method5895();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(ILjava/awt/Component;II)Lloader!ep;")
	private Class225 method5857(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		return this.method5873(local2.y + arg2, (byte) -28, null, 14, arg0 + local2.x);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(IZLjava/awt/Component;)Lloader!ep;")
	private Class225 method5858(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 <= 111) {
			this.run();
		}
		return this.method5873(0, (byte) -28, arg2, 15, arg1 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lloader!ep;")
	private Class225 method5859(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) byte arg2) {
		if (arg2 != -55) {
			this.aClass225_2 = null;
		}
		return this.method5873(0, (byte) -28, arg1, 2, arg0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(IB)Lloader!ep;")
	private Class225 method5860(@OriginalArg(0) int arg0) {
		return this.method5873(0, (byte) -28, null, 3, arg0);
	}

	@OriginalMember(owner = "loader!am", name = "d", descriptor = "(Z)V")
	private void method5861(@OriginalArg(0) boolean arg0) {
		aLong219 = Class228.method5906() + 5000L;
		if (arg0) {
			this.aClass227Array1 = null;
		}
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(IILjava/lang/String;)Lloader!ep;")
	private Class225 method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return arg1 > -9 ? (Class225) null : this.method5873(0, (byte) -28, arg2, 1, arg0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!ep;")
	private Class225 method5863(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 == 0 ? this.method5873(0, (byte) -28, arg0, 16, 0) : (Class225) null;
	}

	@OriginalMember(owner = "loader!am", name = "b", descriptor = "(I)Lloader!ep;")
	private Class225 method5864(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method5845(72, -3, null, null, -43, null);
		}
		return this.method5873(0, (byte) -28, null, 18, 0);
	}

	@OriginalMember(owner = "loader!am", name = "c", descriptor = "(Z)Lloader!ie;")
	private Interface11 method5865(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass226_1 = null;
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(B)Lloader!ep;")
	private Class225 method5866() {
		return this.method5873(0, (byte) -28, null, 12, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(ILjava/net/URL;)Lloader!ep;")
	private Class225 method5868(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 != -16704) {
			aString386 = null;
		}
		return this.method5873(0, (byte) -28, arg1, 4, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(IIIII)Lloader!ep;")
	private Class225 method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg1 == 2548 ? this.method5873((arg3 << 16) + arg2, (byte) -28, null, 6, arg0 + (arg4 << 16)) : (Class225) null;
	}

	@OriginalMember(owner = "loader!am", name = "b", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method5870(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class225 local7 = this.method5853(arg0, (byte) -115, 21, 0, 0);
		if (arg1 < 77) {
			this.method5850(-106, null);
		}
		return (byte[]) local7.anObject9;
	}

	@OriginalMember(owner = "loader!am", name = "b", descriptor = "(Z)Lloader!ep;")
	private Class225 method5871(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			method5848(null, 121);
		}
		return this.method5873(0, (byte) -28, null, 5, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lloader!ep;")
	private Class225 method5872(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2) {
		if (arg2 <= 98) {
			this.method5866();
		}
		return this.method5873(0, (byte) -28, new Object[] { arg1, arg0 }, 9, 0);
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(IBLjava/lang/Object;II)Lloader!ep;")
	private Class225 method5873(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class225 local3 = new Class225();
		local3.anObject10 = arg2;
		local3.anInt6634 = arg3;
		local3.anInt6635 = arg0;
		local3.anInt6632 = arg4;
		synchronized (this) {
			if (this.aClass225_2 == null) {
				this.aClass225_2 = this.aClass225_1 = local3;
			} else {
				this.aClass225_2.aClass225_3 = local3;
				this.aClass225_2 = local3;
			}
			if (arg1 != -28) {
				this.method5873(14, (byte) -127, null, 127, -90);
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!am", name = "a", descriptor = "(ZLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lloader!ep;")
	private Class225 method5874(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) Class arg3) {
		if (!arg0) {
			this.method5850(-46, null);
		}
		return this.method5873(0, (byte) -28, new Object[] { arg3, arg1, arg2 }, 8, 0);
	}
}
