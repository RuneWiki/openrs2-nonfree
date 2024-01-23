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

@OriginalClass("loader!na")
public final class Class202 implements Runnable {

	@OriginalMember(owner = "loader!na", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString460;

	@OriginalMember(owner = "loader!na", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString461;

	@OriginalMember(owner = "loader!na", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString462;

	@OriginalMember(owner = "loader!na", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString463;

	@OriginalMember(owner = "loader!na", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString464;

	@OriginalMember(owner = "loader!na", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString465;

	@OriginalMember(owner = "loader!na", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString466;

	@OriginalMember(owner = "loader!na", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!na", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!na", name = "a", descriptor = "I")
	private static int anInt6333 = 1;

	@OriginalMember(owner = "loader!na", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!na", name = "t", descriptor = "J")
	private static volatile long aLong251 = 0L;

	@OriginalMember(owner = "loader!na", name = "y", descriptor = "Lloader!qg;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!na", name = "b", descriptor = "Z")
	private boolean aBoolean424 = false;

	@OriginalMember(owner = "loader!na", name = "i", descriptor = "Lloader!af;")
	private Class196 aClass196_2 = null;

	@OriginalMember(owner = "loader!na", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!na", name = "x", descriptor = "Lloader!en;")
	private Class199 aClass199_2 = null;

	@OriginalMember(owner = "loader!na", name = "o", descriptor = "Lloader!af;")
	private Class196 aClass196_3 = null;

	@OriginalMember(owner = "loader!na", name = "d", descriptor = "Lloader!af;")
	private Class196 aClass196_1 = null;

	@OriginalMember(owner = "loader!na", name = "A", descriptor = "Lloader!en;")
	private Class199 aClass199_3 = null;

	@OriginalMember(owner = "loader!na", name = "f", descriptor = "Ljava/lang/String;")
	private String aString459;

	@OriginalMember(owner = "loader!na", name = "l", descriptor = "I")
	private int anInt6334;

	@OriginalMember(owner = "loader!na", name = "p", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!na", name = "c", descriptor = "[Lloader!af;")
	private Class196[] aClass196Array1;

	@OriginalMember(owner = "loader!na", name = "w", descriptor = "Lloader!d;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "loader!na", name = "v", descriptor = "Lloader!e;")
	private Class198 aClass198_1;

	@OriginalMember(owner = "loader!na", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!na", name = "b", descriptor = "(ILjava/lang/String;)Lloader!af;")
	private static Class196 method4822(@OriginalArg(1) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString466, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
			@Pc(48) String local48 = local34[local36];
			if (local48.length() <= 0 || (new File(local48)).exists()) {
				try {
					return new Class196(new File(local48, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(80) Exception local80) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!na", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	public static File method4824(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString466, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local69.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local44.length; local92++) {
					@Pc(130) String local130 = local44[local92] + local69[local86] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local79 != 0 || local137.exists()) {
							@Pc(147) String local147 = local44[local92];
							if (local79 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local44[local92] + local69[local86])).mkdir();
								if (arg0 != null) {
									(new File(local44[local92] + local69[local86] + "/" + arg0)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(212) int local212 = local132.read();
								local132.seek(0L);
								local132.write(local212);
								local132.seek(0L);
								local132.close();
								aHashtable2.put(arg2, local137);
								return local137;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local132 != null) {
								local132.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!na", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class202(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString463 = "1.1";
		this.aString459 = arg2;
		aString465 = "Unknown";
		this.anInt6334 = arg1;
		this.anApplet3 = arg0;
		try {
			aString465 = System.getProperty("java.vendor");
			aString463 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString462 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString462 = "Unknown";
		}
		aString464 = aString462.toLowerCase();
		try {
			aString461 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString461 = "";
		}
		try {
			aString460 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString460 = "";
		}
		try {
			aString466 = System.getProperty("user.home");
			if (aString466 != null) {
				aString466 = aString466 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString466 == null) {
			aString466 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass196_1 = new Class196(method4824(null, this.anInt6334, "random.dat"), "rw", 25L);
		this.aClass196_3 = new Class196(method4824(this.aString459, this.anInt6334, "main_file_cache.dat2"), "rw", 104857600L);
		this.aClass196_2 = new Class196(method4824(this.aString459, this.anInt6334, "main_file_cache.idx255"), "rw", 1048576L);
		this.aClass196Array1 = new Class196[arg3];
		for (@Pc(200) int local200 = 0; local200 < arg3; local200++) {
			this.aClass196Array1[local200] = new Class196(method4824(this.aString459, this.anInt6334, "main_file_cache.idx" + local200), "rw", 1048576L);
		}
		try {
			this.aClass197_1 = new Class197();
		} catch (@Pc(239) Throwable local239) {
		}
		try {
			this.aClass198_1 = new Class198();
		} catch (@Pc(246) Throwable local246) {
		}
		@Pc(249) ThreadGroup local249 = Thread.currentThread().getThreadGroup();
		for (@Pc(252) ThreadGroup local252 = local249.getParent(); local252 != null; local252 = local252.getParent()) {
			local249 = local252;
		}
		@Pc(263) Thread[] local263 = new Thread[1000];
		local249.enumerate(local263);
		for (@Pc(269) int local269 = 0; local269 < local263.length; local269++) {
			if (local263[local269] != null && local263[local269].getName().startsWith("AWT")) {
				local263[local269].setPriority(1);
			}
		}
		this.aBoolean424 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!na", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class199 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean424) {
						return;
					}
					if (this.aClass199_2 != null) {
						local17 = this.aClass199_2;
						this.aClass199_2 = this.aClass199_2.aClass199_1;
						if (this.aClass199_2 == null) {
							this.aClass199_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local17.anInt6324;
				if (local47 == 1) {
					if (Class203.method4836() < aLong251) {
						throw new IOException();
					}
					local17.anObject9 = new Socket(InetAddress.getByName((String) local17.anObject8), local17.anInt6325);
				} else if (local47 == 2) {
					@Pc(864) Thread local864 = new Thread((Runnable) local17.anObject8);
					local864.setDaemon(true);
					local864.start();
					local864.setPriority(local17.anInt6325);
					local17.anObject9 = local864;
				} else if (local47 == 4) {
					if (Class203.method4836() < aLong251) {
						throw new IOException();
					}
					local17.anObject9 = new DataInputStream(((URL) local17.anObject8).openStream());
				} else {
					@Pc(113) Object[] local113;
					if (local47 == 8) {
						local113 = (Object[]) local17.anObject8;
						if (((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local113[0]).getDeclaredMethod((String) local113[1], (Class[]) local113[2]);
					} else if (local47 == 9) {
						local113 = (Object[]) local17.anObject8;
						if (((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local113[0]).getDeclaredField((String) local113[1]);
					} else if (local47 == 18) {
						@Pc(823) Clipboard local823 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject9 = local823.getContents(null);
					} else if (local47 == 19) {
						@Pc(812) Transferable local812 = (Transferable) local17.anObject8;
						@Pc(815) Clipboard local815 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local815.setContents(local812, null);
					} else {
						@Pc(207) String local207;
						if (local47 == 3) {
							if (Class203.method4836() < aLong251) {
								throw new IOException();
							}
							local207 = (local17.anInt6325 >> 24 & 0xFF) + "." + (local17.anInt6325 >> 16 & 0xFF) + "." + (local17.anInt6325 >> 8 & 0xFF) + "." + (local17.anInt6325 & 0xFF);
							local17.anObject9 = InetAddress.getByName(local207).getHostName();
						} else if (local47 == 5) {
							local17.anObject9 = this.aClass197_1.method4794();
						} else if (local47 == 6) {
							@Pc(228) Frame local228 = new Frame("Jagex Full Screen");
							local17.anObject9 = local228;
							local228.setResizable(false);
							this.aClass197_1.method4792(local17.anInt6323 >> 16, local228, local17.anInt6325 & 0xFFFF, local17.anInt6323 & 0xFFFF, local17.anInt6325 >>> 16);
						} else if (local47 == 7) {
							this.aClass197_1.method4791();
						} else {
							@Pc(412) Runtime local412;
							@Pc(410) Class[] local410;
							@Pc(418) Method local418;
							if (local47 == 10) {
								local410 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local412 = Runtime.getRuntime();
								if (!aString464.startsWith("mac")) {
									local418 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local410);
									local418.setAccessible(true);
									local418.invoke(local412, local17.anObject8, "jawt");
									local418.setAccessible(false);
								}
								local418 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local410);
								local418.setAccessible(true);
								if (aString464.startsWith("linux") || aString464.startsWith("sunos")) {
									local418.invoke(local412, local17.anObject8, method4824(this.aString459, this.anInt6334, "libjaggl_dri.so").toString());
									@Pc(692) Class local692 = ((Class) local17.anObject8).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
									local692.getMethod("begin").invoke(null);
									local418.invoke(local412, local17.anObject8, method4824(this.aString459, this.anInt6334, "libjaggl.so").toString());
									local692.getMethod("end").invoke(null);
								} else if (aString464.startsWith("mac")) {
									local418.invoke(local412, local17.anObject8, method4824(this.aString459, this.anInt6334, "libjaggl.jnilib").toString());
								} else if (aString464.startsWith("win")) {
									local418.invoke(local412, local17.anObject8, method4824(this.aString459, this.anInt6334, "jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local418.setAccessible(false);
							} else {
								@Pc(283) int local283;
								if (local47 == 11) {
									@Pc(270) Field local270 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local270.setAccessible(true);
									@Pc(281) Vector local281 = (Vector) local270.get(((Class) local17.anObject8).getClassLoader());
									for (local283 = 0; local281.size() > local283; local283++) {
										@Pc(291) Object local291 = local281.elementAt(local283);
										@Pc(298) Method local298 = local291.getClass().getDeclaredMethod("finalize");
										local298.setAccessible(true);
										local298.invoke(local291);
										local298.setAccessible(false);
										@Pc(315) Field local315 = local291.getClass().getDeclaredField("handle");
										local315.setAccessible(true);
										local315.set(local291, Integer.valueOf(0));
										local315.setAccessible(false);
									}
									local270.setAccessible(false);
								} else if (local47 == 12) {
									local207 = (String) local17.anObject8;
									@Pc(345) Class196 local345 = method4822(local207);
									local17.anObject9 = local345;
								} else if (local47 == 14) {
									@Pc(589) int local589 = local17.anInt6325;
									@Pc(592) int local592 = local17.anInt6323;
									this.aClass198_1.method4797(local589, local592);
								} else if (local47 == 15) {
									@Pc(575) boolean local575 = local17.anInt6325 != 0;
									@Pc(579) Component local579 = (Component) local17.anObject8;
									this.aClass198_1.method4795(local575, local579);
								} else if (local47 == 17) {
									local113 = (Object[]) local17.anObject8;
									this.aClass198_1.method4796((Point) local113[2], (int[]) local113[1], (Component) local113[0], local17.anInt6323, local17.anInt6325);
								} else if (local47 == 16) {
									try {
										if (!aString464.startsWith("win")) {
											throw new Exception();
										}
										local207 = (String) local17.anObject8;
										if (!local207.startsWith("http://") && !local207.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(518) String local518 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local283 = 0; local283 < local207.length(); local283++) {
											if (local518.indexOf(local207.charAt(local283)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local207 + "\"");
										local17.anObject9 = null;
									} catch (@Pc(561) Exception local561) {
										local17.anObject9 = local561;
									}
								} else if (local47 == 20) {
									try {
										local410 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										local412 = Runtime.getRuntime();
										local418 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local410);
										local418.setAccessible(true);
										if (aString464.startsWith("win")) {
											if (aString461.startsWith("amd64") || aString461.startsWith("x86_64")) {
												local418.invoke(local412, local17.anObject8, method4824(this.aString459, this.anInt6334, "jagmisc64.dll").toString());
											} else {
												local418.invoke(local412, local17.anObject8, method4824(this.aString459, this.anInt6334, "jagmisc.dll").toString());
											}
										}
										local418.setAccessible(false);
									} catch (@Pc(484) Throwable local484) {
										local17.anObject9 = local484;
									}
								} else {
									throw new Exception();
								}
							}
						}
					}
				}
				local17.anInt6322 = 1;
			} catch (@Pc(881) ThreadDeath local881) {
				throw local881;
			} catch (@Pc(884) Throwable local884) {
				local17.anInt6322 = 2;
			}
		}
	}
}
