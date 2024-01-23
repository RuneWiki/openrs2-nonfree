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

@OriginalClass("loader!rj")
public final class Class199 implements Runnable {

	@OriginalMember(owner = "loader!rj", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString348;

	@OriginalMember(owner = "loader!rj", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString349;

	@OriginalMember(owner = "loader!rj", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString351;

	@OriginalMember(owner = "loader!rj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString352;

	@OriginalMember(owner = "loader!rj", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString353;

	@OriginalMember(owner = "loader!rj", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString354;

	@OriginalMember(owner = "loader!rj", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString355;

	@OriginalMember(owner = "loader!rj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!rj", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!rj", name = "j", descriptor = "I")
	private static int anInt5753 = 1;

	@OriginalMember(owner = "loader!rj", name = "z", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!rj", name = "t", descriptor = "J")
	private static volatile long aLong217 = 0L;

	@OriginalMember(owner = "loader!rj", name = "g", descriptor = "Lloader!ik;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!rj", name = "i", descriptor = "Lloader!on;")
	private Class198 aClass198_1 = null;

	@OriginalMember(owner = "loader!rj", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!rj", name = "x", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "loader!rj", name = "m", descriptor = "Lloader!on;")
	private Class198 aClass198_2 = null;

	@OriginalMember(owner = "loader!rj", name = "l", descriptor = "Lloader!vd;")
	private Class200 aClass200_1 = null;

	@OriginalMember(owner = "loader!rj", name = "y", descriptor = "Lloader!vd;")
	private Class200 aClass200_2 = null;

	@OriginalMember(owner = "loader!rj", name = "c", descriptor = "Lloader!on;")
	private Class198 aClass198_3 = null;

	@OriginalMember(owner = "loader!rj", name = "w", descriptor = "Ljava/lang/String;")
	private String aString350;

	@OriginalMember(owner = "loader!rj", name = "q", descriptor = "I")
	private int anInt5754;

	@OriginalMember(owner = "loader!rj", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!rj", name = "n", descriptor = "[Lloader!on;")
	private Class198[] aClass198Array1;

	@OriginalMember(owner = "loader!rj", name = "r", descriptor = "Lloader!g;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "loader!rj", name = "A", descriptor = "Lloader!e;")
	private Class195 aClass195_1;

	@OriginalMember(owner = "loader!rj", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "loader!rj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)Ljava/io/File;")
	public static File method4838(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(35) String[] local35 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(70) String[] local70 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString348, "/tmp/", "" };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(84) int local84 = 0; local84 < local35.length; local84++) {
				for (@Pc(94) int local94 = 0; local94 < local70.length; local94++) {
					@Pc(104) RandomAccessFile local104 = null;
					@Pc(135) String local135 = local70[local94] + local35[local84] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					try {
						@Pc(140) File local140 = new File(local135);
						if (local72 != 0 || local140.exists()) {
							@Pc(154) String local154 = local70[local94];
							if (local72 != 1 || local154.length() <= 0 || (new File(local154)).exists()) {
								(new File(local70[local94] + local35[local84])).mkdir();
								if (arg2 != null) {
									(new File(local70[local94] + local35[local84] + "/" + arg2)).mkdir();
								}
								local104 = new RandomAccessFile(local140, "rw");
								@Pc(221) int local221 = local104.read();
								local104.seek(0L);
								local104.write(local221);
								local104.seek(0L);
								local104.close();
								aHashtable2.put(arg1, local140);
								return local140;
							}
						}
					} catch (@Pc(240) Exception local240) {
						try {
							if (local104 != null) {
								local104.close();
							}
						} catch (@Pc(248) Exception local248) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!rj", name = "a", descriptor = "(ILjava/lang/String;)Lloader!on;")
	private static Class198 method4840(@OriginalArg(1) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString348, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
			@Pc(48) String local48 = local34[local36];
			if (local48.length() <= 0 || (new File(local48)).exists()) {
				try {
					return new Class198(new File(local48, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(83) Exception local83) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!rj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class199(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString350 = arg2;
		this.anApplet3 = arg0;
		aString352 = "Unknown";
		aString354 = "1.1";
		this.anInt5754 = arg1;
		try {
			aString352 = System.getProperty("java.vendor");
			aString354 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString351 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString351 = "Unknown";
		}
		aString355 = aString351.toLowerCase();
		try {
			aString353 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString353 = "";
		}
		try {
			aString349 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString349 = "";
		}
		try {
			aString348 = System.getProperty("user.home");
			if (aString348 != null) {
				aString348 = aString348 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString348 == null) {
			aString348 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass198_1 = new Class198(method4838(this.anInt5754, "random.dat", null), "rw", 25L);
		this.aClass198_2 = new Class198(method4838(this.anInt5754, "main_file_cache.dat2", this.aString350), "rw", 104857600L);
		this.aClass198_3 = new Class198(method4838(this.anInt5754, "main_file_cache.idx255", this.aString350), "rw", 1048576L);
		this.aClass198Array1 = new Class198[arg3];
		for (@Pc(198) int local198 = 0; local198 < arg3; local198++) {
			this.aClass198Array1[local198] = new Class198(method4838(this.anInt5754, "main_file_cache.idx" + local198, this.aString350), "rw", 1048576L);
		}
		try {
			this.aClass197_1 = new Class197();
		} catch (@Pc(237) Throwable local237) {
		}
		try {
			this.aClass195_1 = new Class195();
		} catch (@Pc(244) Throwable local244) {
		}
		@Pc(247) ThreadGroup local247 = Thread.currentThread().getThreadGroup();
		for (@Pc(250) ThreadGroup local250 = local247.getParent(); local250 != null; local250 = local250.getParent()) {
			local247 = local250;
		}
		@Pc(261) Thread[] local261 = new Thread[1000];
		local247.enumerate(local261);
		for (@Pc(267) int local267 = 0; local267 < local261.length; local267++) {
			if (local261[local267] != null && local261[local267].getName().startsWith("AWT")) {
				local261[local267].setPriority(1);
			}
		}
		this.aBoolean397 = false;
		this.aThread5 = new Thread(this);
		this.aThread5.setPriority(10);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "loader!rj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class200 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean397) {
						return;
					}
					if (this.aClass200_2 != null) {
						local16 = this.aClass200_2;
						this.aClass200_2 = this.aClass200_2.aClass200_3;
						if (this.aClass200_2 == null) {
							this.aClass200_1 = null;
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
				@Pc(45) int local45 = local16.anInt5756;
				if (local45 == 1) {
					if (aLong217 > Class201.method4846()) {
						throw new IOException();
					}
					local16.anObject8 = new Socket(InetAddress.getByName((String) local16.anObject9), local16.anInt5758);
				} else if (local45 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local16.anObject9);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local16.anInt5758);
					local16.anObject8 = local60;
				} else if (local45 == 4) {
					if (aLong217 > Class201.method4846()) {
						throw new IOException();
					}
					local16.anObject8 = new DataInputStream(((URL) local16.anObject9).openStream());
				} else {
					@Pc(109) Object[] local109;
					if (local45 == 8) {
						local109 = (Object[]) local16.anObject9;
						if (((Class) local109[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local109[0]).getDeclaredMethod((String) local109[1], (Class[]) local109[2]);
					} else if (local45 == 9) {
						local109 = (Object[]) local16.anObject9;
						if (((Class) local109[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local109[0]).getDeclaredField((String) local109[1]);
					} else if (local45 == 18) {
						@Pc(149) Clipboard local149 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject8 = local149.getContents(null);
					} else if (local45 == 19) {
						@Pc(809) Transferable local809 = (Transferable) local16.anObject9;
						@Pc(812) Clipboard local812 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local812.setContents(local809, null);
					} else {
						@Pc(209) String local209;
						if (local45 == 3) {
							if (Class201.method4846() < aLong217) {
								throw new IOException();
							}
							local209 = (local16.anInt5758 >> 24 & 0xFF) + "." + (local16.anInt5758 >> 16 & 0xFF) + "." + (local16.anInt5758 >> 8 & 0xFF) + "." + (local16.anInt5758 & 0xFF);
							local16.anObject8 = InetAddress.getByName(local209).getHostName();
						} else if (local45 == 5) {
							local16.anObject8 = this.aClass197_1.method4799();
						} else if (local45 == 6) {
							@Pc(770) Frame local770 = new Frame("Jagex Full Screen");
							local16.anObject8 = local770;
							local770.setResizable(false);
							this.aClass197_1.method4800(local770, local16.anInt5755 >> 16, local16.anInt5755 & 0xFFFF, local16.anInt5758 & 0xFFFF, local16.anInt5758 >>> 16);
						} else if (local45 == 7) {
							this.aClass197_1.method4801();
						} else {
							@Pc(298) Method local298;
							@Pc(292) Runtime local292;
							@Pc(290) Class[] local290;
							if (local45 == 10) {
								local290 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local292 = Runtime.getRuntime();
								if (!aString355.startsWith("mac")) {
									local298 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local290);
									local298.setAccessible(true);
									local298.invoke(local292, local16.anObject9, "jawt");
									local298.setAccessible(false);
								}
								local298 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local290);
								local298.setAccessible(true);
								if (aString355.startsWith("linux") || aString355.startsWith("sunos")) {
									local298.invoke(local292, local16.anObject9, method4838(this.anInt5754, "libjaggl_dri.so", this.aString350).toString());
									@Pc(660) Class local660 = ((Class) local16.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
									local660.getMethod("begin").invoke(null);
									local298.invoke(local292, local16.anObject9, method4838(this.anInt5754, "libjaggl.so", this.aString350).toString());
									local660.getMethod("end").invoke(null);
								} else if (aString355.startsWith("mac")) {
									local298.invoke(local292, local16.anObject9, method4838(this.anInt5754, "libjaggl.jnilib", this.aString350).toString());
								} else if (aString355.startsWith("win")) {
									local298.invoke(local292, local16.anObject9, method4838(this.anInt5754, "jaggl.dll", this.aString350).toString());
								} else {
									throw new Exception();
								}
								local298.setAccessible(false);
							} else {
								@Pc(400) int local400;
								if (local45 == 11) {
									@Pc(503) Field local503 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local503.setAccessible(true);
									@Pc(514) Vector local514 = (Vector) local503.get(((Class) local16.anObject9).getClassLoader());
									for (local400 = 0; local400 < local514.size(); local400++) {
										@Pc(524) Object local524 = local514.elementAt(local400);
										@Pc(531) Method local531 = local524.getClass().getDeclaredMethod("finalize");
										local531.setAccessible(true);
										local531.invoke(local524);
										local531.setAccessible(false);
										@Pc(548) Field local548 = local524.getClass().getDeclaredField("handle");
										local548.setAccessible(true);
										local548.set(local524, Integer.valueOf(0));
										local548.setAccessible(false);
									}
									local503.setAccessible(false);
								} else if (local45 == 12) {
									local209 = (String) local16.anObject9;
									@Pc(254) Class198 local254 = method4840(local209);
									local16.anObject8 = local254;
								} else if (local45 == 14) {
									@Pc(488) int local488 = local16.anInt5755;
									@Pc(491) int local491 = local16.anInt5758;
									this.aClass195_1.method4795(local488, local491);
								} else if (local45 == 15) {
									@Pc(474) boolean local474 = local16.anInt5758 != 0;
									@Pc(478) Component local478 = (Component) local16.anObject9;
									this.aClass195_1.method4796(local474, local478);
								} else if (local45 == 17) {
									local109 = (Object[]) local16.anObject9;
									this.aClass195_1.method4797(local16.anInt5755, (Point) local109[2], local16.anInt5758, (Component) local109[0], (int[]) local109[1]);
								} else if (local45 == 16) {
									try {
										if (!aString355.startsWith("win")) {
											throw new Exception();
										}
										local209 = (String) local16.anObject9;
										if (!local209.startsWith("http://") && !local209.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(398) String local398 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local400 = 0; local209.length() > local400; local400++) {
											if (local398.indexOf(local209.charAt(local400)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local209 + "\"");
										local16.anObject8 = null;
									} catch (@Pc(435) Exception local435) {
										local16.anObject8 = local435;
									}
								} else if (local45 == 20) {
									try {
										local290 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										local292 = Runtime.getRuntime();
										local298 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local290);
										local298.setAccessible(true);
										if (aString355.startsWith("win")) {
											if (aString353.startsWith("amd64") || aString353.startsWith("x86_64")) {
												local298.invoke(local292, local16.anObject9, method4838(this.anInt5754, "jagmisc64.dll", this.aString350).toString());
											} else {
												local298.invoke(local292, local16.anObject9, method4838(this.anInt5754, "jagmisc.dll", this.aString350).toString());
											}
										}
										local298.setAccessible(false);
									} catch (@Pc(363) Throwable local363) {
										local16.anObject8 = local363;
									}
								} else {
									throw new Exception();
								}
							}
						}
					}
				}
				local16.anInt5757 = 1;
			} catch (@Pc(873) ThreadDeath local873) {
				throw local873;
			} catch (@Pc(876) Throwable local876) {
				local16.anInt5757 = 2;
			}
		}
	}
}
