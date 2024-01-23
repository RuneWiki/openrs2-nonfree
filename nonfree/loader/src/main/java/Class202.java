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

@OriginalClass("loader!nf")
public final class Class202 implements Runnable {

	@OriginalMember(owner = "loader!nf", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString201;

	@OriginalMember(owner = "loader!nf", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString202;

	@OriginalMember(owner = "loader!nf", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString204;

	@OriginalMember(owner = "loader!nf", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString205;

	@OriginalMember(owner = "loader!nf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString206;

	@OriginalMember(owner = "loader!nf", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString207;

	@OriginalMember(owner = "loader!nf", name = "y", descriptor = "Ljava/lang/String;")
	private static String aString208;

	@OriginalMember(owner = "loader!nf", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!nf", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!nf", name = "m", descriptor = "I")
	private static int anInt5961 = 1;

	@OriginalMember(owner = "loader!nf", name = "w", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!nf", name = "u", descriptor = "J")
	private static volatile long aLong227 = 0L;

	@OriginalMember(owner = "loader!nf", name = "s", descriptor = "Lloader!hd;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!nf", name = "h", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "loader!nf", name = "i", descriptor = "Lloader!oe;")
	private Class203 aClass203_2 = null;

	@OriginalMember(owner = "loader!nf", name = "k", descriptor = "Lloader!oe;")
	private Class203 aClass203_1 = null;

	@OriginalMember(owner = "loader!nf", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!nf", name = "n", descriptor = "Lloader!oe;")
	private Class203 aClass203_3 = null;

	@OriginalMember(owner = "loader!nf", name = "o", descriptor = "Lloader!aj;")
	private Class197 aClass197_2 = null;

	@OriginalMember(owner = "loader!nf", name = "A", descriptor = "Lloader!aj;")
	private Class197 aClass197_3 = null;

	@OriginalMember(owner = "loader!nf", name = "p", descriptor = "Ljava/lang/String;")
	private String aString203;

	@OriginalMember(owner = "loader!nf", name = "c", descriptor = "I")
	private int anInt5960;

	@OriginalMember(owner = "loader!nf", name = "f", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!nf", name = "d", descriptor = "[Lloader!oe;")
	private Class203[] aClass203Array1;

	@OriginalMember(owner = "loader!nf", name = "x", descriptor = "Lloader!e;")
	private Class198 aClass198_1;

	@OriginalMember(owner = "loader!nf", name = "z", descriptor = "Lloader!a;")
	private Class196 aClass196_1;

	@OriginalMember(owner = "loader!nf", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!nf", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method4701(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString208, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(77) int local77 = 0; local77 < local68.length; local77++) {
				for (@Pc(87) int local87 = 0; local87 < local43.length; local87++) {
					@Pc(93) RandomAccessFile local93 = null;
					@Pc(123) String local123 = local43[local87] + local68[local77] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					try {
						@Pc(128) File local128 = new File(local123);
						if (local70 != 0 || local128.exists()) {
							@Pc(141) String local141 = local43[local87];
							if (local70 != 1 || local141.length() <= 0 || (new File(local141)).exists()) {
								(new File(local43[local87] + local68[local77])).mkdir();
								if (arg0 != null) {
									(new File(local43[local87] + local68[local77] + "/" + arg0)).mkdir();
								}
								local93 = new RandomAccessFile(local128, "rw");
								@Pc(210) int local210 = local93.read();
								local93.seek(0L);
								local93.write(local210);
								local93.seek(0L);
								local93.close();
								aHashtable2.put(arg2, local128);
								return local128;
							}
						}
					} catch (@Pc(229) Exception local229) {
						try {
							if (local93 != null) {
								local93.close();
							}
						} catch (@Pc(238) Exception local238) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!nf", name = "b", descriptor = "(ILjava/lang/String;)Lloader!oe;")
	private static Class203 method4713(@OriginalArg(1) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString208, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
			@Pc(56) String local56 = local34[local36];
			if (local56.length() <= 0 || (new File(local56)).exists()) {
				try {
					return new Class203(new File(local56, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(89) Exception local89) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!nf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class202(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString203 = arg2;
		this.anInt5960 = arg1;
		aString206 = "1.1";
		aString205 = "Unknown";
		this.anApplet3 = arg0;
		try {
			aString205 = System.getProperty("java.vendor");
			aString206 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString207 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString207 = "Unknown";
		}
		aString202 = aString207.toLowerCase();
		try {
			aString201 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString201 = "";
		}
		try {
			aString204 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString204 = "";
		}
		try {
			aString208 = System.getProperty("user.home");
			if (aString208 != null) {
				aString208 = aString208 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString208 == null) {
			aString208 = "~/";
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
		} catch (@Pc(126) Exception local126) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(154) Exception local154) {
		}
		this.aClass203_3 = new Class203(method4701(null, this.anInt5960, "random.dat"), "rw", 25L);
		this.aClass203_1 = new Class203(method4701(this.aString203, this.anInt5960, "main_file_cache.dat2"), "rw", 104857600L);
		this.aClass203_2 = new Class203(method4701(this.aString203, this.anInt5960, "main_file_cache.idx255"), "rw", 1048576L);
		this.aClass203Array1 = new Class203[arg3];
		for (@Pc(201) int local201 = 0; local201 < arg3; local201++) {
			this.aClass203Array1[local201] = new Class203(method4701(this.aString203, this.anInt5960, "main_file_cache.idx" + local201), "rw", 1048576L);
		}
		try {
			this.aClass198_1 = new Class198();
		} catch (@Pc(236) Throwable local236) {
		}
		try {
			this.aClass196_1 = new Class196();
		} catch (@Pc(243) Throwable local243) {
		}
		@Pc(246) ThreadGroup local246 = Thread.currentThread().getThreadGroup();
		@Pc(249) Thread[] local249 = new Thread[1000];
		for (@Pc(252) ThreadGroup local252 = local246.getParent(); local252 != null; local252 = local252.getParent()) {
			local246 = local252;
		}
		local246.enumerate(local249);
		for (@Pc(267) int local267 = 0; local267 < local249.length; local267++) {
			if (local249[local267] != null && local249[local267].getName().startsWith("AWT")) {
				local249[local267].setPriority(1);
			}
		}
		this.aBoolean433 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!nf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class197 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean433) {
						return;
					}
					if (this.aClass197_2 != null) {
						local17 = this.aClass197_2;
						this.aClass197_2 = this.aClass197_2.aClass197_1;
						if (this.aClass197_2 == null) {
							this.aClass197_3 = null;
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
				@Pc(45) int local45 = local17.anInt5948;
				if (local45 == 1) {
					if (Class201.method4692() < aLong227) {
						throw new IOException();
					}
					local17.anObject8 = new Socket(InetAddress.getByName((String) local17.anObject9), local17.anInt5947);
				} else if (local45 == 2) {
					@Pc(823) Thread local823 = new Thread((Runnable) local17.anObject9);
					local823.setDaemon(true);
					local823.start();
					local823.setPriority(local17.anInt5947);
					local17.anObject8 = local823;
				} else if (local45 == 4) {
					if (Class201.method4692() < aLong227) {
						throw new IOException();
					}
					local17.anObject8 = new DataInputStream(((URL) local17.anObject9).openStream());
				} else {
					@Pc(85) Object[] local85;
					if (local45 == 8) {
						local85 = (Object[]) local17.anObject9;
						if (((Class) local85[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local85[0]).getDeclaredMethod((String) local85[1], (Class[]) local85[2]);
					} else if (local45 == 9) {
						local85 = (Object[]) local17.anObject9;
						if (((Class) local85[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local85[0]).getDeclaredField((String) local85[1]);
					} else if (local45 == 18) {
						@Pc(150) Clipboard local150 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject8 = local150.getContents(null);
					} else if (local45 == 19) {
						@Pc(165) Transferable local165 = (Transferable) local17.anObject9;
						@Pc(168) Clipboard local168 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local168.setContents(local165, null);
					} else {
						@Pc(489) String local489;
						if (local45 == 3) {
							if (Class201.method4692() < aLong227) {
								throw new IOException();
							}
							local489 = (local17.anInt5947 >> 24 & 0xFF) + "." + (local17.anInt5947 >> 16 & 0xFF) + "." + (local17.anInt5947 >> 8 & 0xFF) + "." + (local17.anInt5947 & 0xFF);
							local17.anObject8 = InetAddress.getByName(local489).getHostName();
						} else if (local45 == 5) {
							local17.anObject8 = this.aClass198_1.method4685();
						} else if (local45 == 6) {
							@Pc(189) Frame local189 = new Frame("Jagex Full Screen");
							local17.anObject8 = local189;
							local189.setResizable(false);
							this.aClass198_1.method4683(local189, local17.anInt5949 & 0xFFFF, local17.anInt5947 & 0xFFFF, local17.anInt5949 >> 16, local17.anInt5947 >>> 16);
						} else if (local45 == 7) {
							this.aClass198_1.method4684();
						} else {
							@Pc(248) Method local248;
							@Pc(238) Runtime local238;
							@Pc(236) Class[] local236;
							if (local45 == 10) {
								local236 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local238 = Runtime.getRuntime();
								if (!aString202.startsWith("mac")) {
									local248 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local236);
									local248.setAccessible(true);
									local248.invoke(local238, local17.anObject9, "jawt");
									local248.setAccessible(false);
								}
								local248 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local236);
								local248.setAccessible(true);
								if (aString202.startsWith("linux") || aString202.startsWith("sunos")) {
									local248.invoke(local238, local17.anObject9, method4701(this.aString203, this.anInt5960, "libjaggl_dri.so").toString());
									@Pc(315) Class local315 = ((Class) local17.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
									local315.getMethod("begin").invoke(null);
									local248.invoke(local238, local17.anObject9, method4701(this.aString203, this.anInt5960, "libjaggl.so").toString());
									local315.getMethod("end").invoke(null);
								} else if (aString202.startsWith("mac")) {
									local248.invoke(local238, local17.anObject9, method4701(this.aString203, this.anInt5960, "libjaggl.jnilib").toString());
								} else if (aString202.startsWith("win")) {
									local248.invoke(local238, local17.anObject9, method4701(this.aString203, this.anInt5960, "jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local248.setAccessible(false);
							} else {
								@Pc(505) int local505;
								if (local45 == 11) {
									@Pc(687) Field local687 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local687.setAccessible(true);
									@Pc(698) Vector local698 = (Vector) local687.get(((Class) local17.anObject9).getClassLoader());
									for (local505 = 0; local698.size() > local505; local505++) {
										@Pc(708) Object local708 = local698.elementAt(local505);
										@Pc(715) Method local715 = local708.getClass().getDeclaredMethod("finalize");
										local715.setAccessible(true);
										local715.invoke(local708);
										local715.setAccessible(false);
										@Pc(732) Field local732 = local708.getClass().getDeclaredField("handle");
										local732.setAccessible(true);
										local732.set(local708, Integer.valueOf(0));
										local732.setAccessible(false);
									}
									local687.setAccessible(false);
								} else if (local45 == 12) {
									local489 = (String) local17.anObject9;
									@Pc(678) Class203 local678 = method4713(local489);
									local17.anObject8 = local678;
								} else if (local45 == 14) {
									@Pc(438) int local438 = local17.anInt5947;
									@Pc(441) int local441 = local17.anInt5949;
									this.aClass196_1.method4673(local441, local438);
								} else if (local45 == 15) {
									@Pc(459) boolean local459 = local17.anInt5947 != 0;
									@Pc(463) Component local463 = (Component) local17.anObject9;
									this.aClass196_1.method4671(local463, local459);
								} else if (local45 == 17) {
									local85 = (Object[]) local17.anObject9;
									this.aClass196_1.method4672(local17.anInt5947, (int[]) local85[1], (Component) local85[0], (Point) local85[2], local17.anInt5949);
								} else if (local45 == 16) {
									try {
										if (!aString202.startsWith("win")) {
											throw new Exception();
										}
										local489 = (String) local17.anObject9;
										if (!local489.startsWith("http://") && !local489.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(503) String local503 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local505 = 0; local505 < local489.length(); local505++) {
											if (local503.indexOf(local489.charAt(local505)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local489 + "\"");
										local17.anObject8 = null;
									} catch (@Pc(541) Exception local541) {
										local17.anObject8 = local541;
									}
								} else if (local45 == 20) {
									try {
										local236 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										local238 = Runtime.getRuntime();
										local248 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local236);
										local248.setAccessible(true);
										if (aString202.startsWith("win")) {
											if (aString201.startsWith("amd64") || aString201.startsWith("x86_64")) {
												local248.invoke(local238, local17.anObject9, method4701(this.aString203, this.anInt5960, "jagmisc64.dll").toString());
											} else {
												local248.invoke(local238, local17.anObject9, method4701(this.aString203, this.anInt5960, "jagmisc.dll").toString());
											}
										}
										local248.setAccessible(false);
									} catch (@Pc(639) Throwable local639) {
										local17.anObject8 = local639;
									}
								} else {
									throw new Exception();
								}
							}
						}
					}
				}
				local17.anInt5950 = 1;
			} catch (@Pc(861) ThreadDeath local861) {
				throw local861;
			} catch (@Pc(864) Throwable local864) {
				local17.anInt5950 = 2;
			}
		}
	}
}
