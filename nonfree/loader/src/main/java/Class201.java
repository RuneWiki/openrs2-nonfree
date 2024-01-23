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

@OriginalClass("loader!uo")
public final class Class201 implements Runnable {

	@OriginalMember(owner = "loader!uo", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString227;

	@OriginalMember(owner = "loader!uo", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString228;

	@OriginalMember(owner = "loader!uo", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString229;

	@OriginalMember(owner = "loader!uo", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString231;

	@OriginalMember(owner = "loader!uo", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString232;

	@OriginalMember(owner = "loader!uo", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString233;

	@OriginalMember(owner = "loader!uo", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString234;

	@OriginalMember(owner = "loader!uo", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!uo", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!uo", name = "i", descriptor = "I")
	private static int anInt5651 = 1;

	@OriginalMember(owner = "loader!uo", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!uo", name = "v", descriptor = "J")
	private static volatile long aLong220 = 0L;

	@OriginalMember(owner = "loader!uo", name = "A", descriptor = "Lloader!fl;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!uo", name = "f", descriptor = "Lloader!eo;")
	private Class196 aClass196_2 = null;

	@OriginalMember(owner = "loader!uo", name = "o", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!uo", name = "k", descriptor = "Lloader!sc;")
	private Class200 aClass200_2 = null;

	@OriginalMember(owner = "loader!uo", name = "j", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "loader!uo", name = "p", descriptor = "Lloader!eo;")
	private Class196 aClass196_1 = null;

	@OriginalMember(owner = "loader!uo", name = "s", descriptor = "Lloader!eo;")
	private Class196 aClass196_3 = null;

	@OriginalMember(owner = "loader!uo", name = "a", descriptor = "Lloader!sc;")
	private Class200 aClass200_3 = null;

	@OriginalMember(owner = "loader!uo", name = "w", descriptor = "Ljava/lang/String;")
	private String aString230;

	@OriginalMember(owner = "loader!uo", name = "y", descriptor = "I")
	private int anInt5650;

	@OriginalMember(owner = "loader!uo", name = "n", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!uo", name = "g", descriptor = "[Lloader!eo;")
	private Class196[] aClass196Array1;

	@OriginalMember(owner = "loader!uo", name = "x", descriptor = "Lloader!f;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "loader!uo", name = "l", descriptor = "Lloader!b;")
	private Class194 aClass194_1;

	@OriginalMember(owner = "loader!uo", name = "z", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!uo", name = "b", descriptor = "(Ljava/lang/String;B)Lloader!eo;")
	private static Class196 method4723(@OriginalArg(0) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString227, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(42) int local42 = 0; local42 < local34.length; local42++) {
			@Pc(54) String local54 = local34[local42];
			if (local54.length() <= 0 || (new File(local54)).exists()) {
				try {
					return new Class196(new File(local54, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(87) Exception local87) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!uo", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method4727(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(10) File local10 = (File) aHashtable2.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString227, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local76.length; local83++) {
				for (@Pc(89) int local89 = 0; local89 < local51.length; local89++) {
					@Pc(128) String local128 = local51[local89] + local76[local83] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(130) RandomAccessFile local130 = null;
					try {
						@Pc(135) File local135 = new File(local128);
						if (local78 != 0 || local135.exists()) {
							@Pc(146) String local146 = local51[local89];
							if (local78 != 1 || local146.length() <= 0 || (new File(local146)).exists()) {
								(new File(local51[local89] + local76[local83])).mkdir();
								if (arg2 != null) {
									(new File(local51[local89] + local76[local83] + "/" + arg2)).mkdir();
								}
								local130 = new RandomAccessFile(local135, "rw");
								@Pc(211) int local211 = local130.read();
								local130.seek(0L);
								local130.write(local211);
								local130.seek(0L);
								local130.close();
								aHashtable2.put(arg0, local135);
								return local135;
							}
						}
					} catch (@Pc(230) Exception local230) {
						try {
							if (local130 != null) {
								local130.close();
							}
						} catch (@Pc(238) Exception local238) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!uo", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class201(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString230 = arg2;
		this.anApplet3 = arg0;
		this.anInt5650 = arg1;
		aString231 = "Unknown";
		aString228 = "1.1";
		try {
			aString231 = System.getProperty("java.vendor");
			aString228 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString234 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString234 = "Unknown";
		}
		aString233 = aString234.toLowerCase();
		try {
			aString229 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString229 = "";
		}
		try {
			aString232 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString232 = "";
		}
		try {
			aString227 = System.getProperty("user.home");
			if (aString227 != null) {
				aString227 = aString227 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString227 == null) {
			aString227 = "~/";
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
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(150) Exception local150) {
		}
		this.aClass196_2 = new Class196(method4727("random.dat", this.anInt5650, null), "rw", 25L);
		this.aClass196_3 = new Class196(method4727("main_file_cache.dat2", this.anInt5650, this.aString230), "rw", 104857600L);
		this.aClass196_1 = new Class196(method4727("main_file_cache.idx255", this.anInt5650, this.aString230), "rw", 1048576L);
		this.aClass196Array1 = new Class196[arg3];
		for (@Pc(197) int local197 = 0; local197 < arg3; local197++) {
			this.aClass196Array1[local197] = new Class196(method4727("main_file_cache.idx" + local197, this.anInt5650, this.aString230), "rw", 1048576L);
		}
		try {
			this.aClass197_1 = new Class197();
		} catch (@Pc(236) Throwable local236) {
		}
		try {
			this.aClass194_1 = new Class194();
		} catch (@Pc(243) Throwable local243) {
		}
		@Pc(246) ThreadGroup local246 = Thread.currentThread().getThreadGroup();
		for (@Pc(249) ThreadGroup local249 = local246.getParent(); local249 != null; local249 = local249.getParent()) {
			local246 = local249;
		}
		@Pc(261) Thread[] local261 = new Thread[1000];
		local246.enumerate(local261);
		for (@Pc(267) int local267 = 0; local267 < local261.length; local267++) {
			if (local261[local267] != null && local261[local267].getName().startsWith("AWT")) {
				local261[local267].setPriority(1);
			}
		}
		this.aBoolean536 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!uo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class200 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean536) {
						return;
					}
					if (this.aClass200_3 != null) {
						local15 = this.aClass200_3;
						this.aClass200_3 = this.aClass200_3.aClass200_1;
						if (this.aClass200_3 == null) {
							this.aClass200_2 = null;
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
				@Pc(45) int local45 = local15.anInt5647;
				if (local45 == 1) {
					if (aLong220 > Class199.method4715()) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt5648);
				} else if (local45 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local15.anObject9);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local15.anInt5648);
					local15.anObject8 = local60;
				} else if (local45 == 4) {
					if (aLong220 > Class199.method4715()) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(107) Object[] local107;
					if (local45 == 8) {
						local107 = (Object[]) local15.anObject9;
						if (((Class) local107[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local107[0]).getDeclaredMethod((String) local107[1], (Class[]) local107[2]);
					} else if (local45 == 9) {
						local107 = (Object[]) local15.anObject9;
						if (((Class) local107[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local107[0]).getDeclaredField((String) local107[1]);
					} else if (local45 == 18) {
						@Pc(176) Clipboard local176 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local176.getContents(null);
					} else if (local45 == 19) {
						@Pc(840) Transferable local840 = (Transferable) local15.anObject9;
						@Pc(843) Clipboard local843 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local843.setContents(local840, null);
					} else {
						@Pc(242) String local242;
						if (local45 == 3) {
							if (aLong220 > Class199.method4715()) {
								throw new IOException();
							}
							local242 = (local15.anInt5648 >> 24 & 0xFF) + "." + (local15.anInt5648 >> 16 & 0xFF) + "." + (local15.anInt5648 >> 8 & 0xFF) + "." + (local15.anInt5648 & 0xFF);
							local15.anObject8 = InetAddress.getByName(local242).getHostName();
						} else if (local45 == 5) {
							local15.anObject8 = this.aClass197_1.method4700();
						} else if (local45 == 6) {
							@Pc(808) Frame local808 = new Frame("Jagex Full Screen");
							local15.anObject8 = local808;
							local808.setResizable(false);
							this.aClass197_1.method4701(local15.anInt5646 & 0xFFFF, local808, local15.anInt5646 >> 16, local15.anInt5648 >>> 16, local15.anInt5648 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass197_1.method4702();
						} else {
							@Pc(473) Runtime local473;
							@Pc(471) Class[] local471;
							@Pc(479) Method local479;
							if (local45 == 10) {
								local471 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local473 = Runtime.getRuntime();
								if (!aString233.startsWith("mac")) {
									local479 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local471);
									local479.setAccessible(true);
									local479.invoke(local473, local15.anObject9, "jawt");
									local479.setAccessible(false);
								}
								local479 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local471);
								local479.setAccessible(true);
								if (aString233.startsWith("linux") || aString233.startsWith("sunos")) {
									local479.invoke(local473, local15.anObject9, method4727("libjaggl_dri.so", this.anInt5650, this.aString230).toString());
									@Pc(699) Class local699 = ((Class) local15.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
									local699.getMethod("begin").invoke(null);
									local479.invoke(local473, local15.anObject9, method4727("libjaggl.so", this.anInt5650, this.aString230).toString());
									local699.getMethod("end").invoke(null);
								} else if (aString233.startsWith("mac")) {
									local479.invoke(local473, local15.anObject9, method4727("libjaggl.jnilib", this.anInt5650, this.aString230).toString());
								} else if (aString233.startsWith("win")) {
									local479.invoke(local473, local15.anObject9, method4727("jaggl.dll", this.anInt5650, this.aString230).toString());
								} else {
									throw new Exception();
								}
								local479.setAccessible(false);
							} else {
								@Pc(299) int local299;
								if (local45 == 11) {
									@Pc(286) Field local286 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local286.setAccessible(true);
									@Pc(297) Vector local297 = (Vector) local286.get(((Class) local15.anObject9).getClassLoader());
									for (local299 = 0; local299 < local297.size(); local299++) {
										@Pc(307) Object local307 = local297.elementAt(local299);
										@Pc(314) Method local314 = local307.getClass().getDeclaredMethod("finalize");
										local314.setAccessible(true);
										local314.invoke(local307);
										local314.setAccessible(false);
										@Pc(331) Field local331 = local307.getClass().getDeclaredField("handle");
										local331.setAccessible(true);
										local331.set(local307, Integer.valueOf(0));
										local331.setAccessible(false);
									}
									local286.setAccessible(false);
								} else if (local45 == 12) {
									local242 = (String) local15.anObject9;
									@Pc(602) Class196 local602 = method4723(local242);
									local15.anObject8 = local602;
								} else if (local45 == 14) {
									@Pc(359) int local359 = local15.anInt5648;
									@Pc(362) int local362 = local15.anInt5646;
									this.aClass194_1.method4682(local362, local359);
								} else if (local45 == 15) {
									@Pc(583) boolean local583 = local15.anInt5648 != 0;
									@Pc(587) Component local587 = (Component) local15.anObject9;
									this.aClass194_1.method4684(local587, local583);
								} else if (local45 == 17) {
									local107 = (Object[]) local15.anObject9;
									this.aClass194_1.method4683((int[]) local107[1], local15.anInt5646, (Component) local107[0], (Point) local107[2], local15.anInt5648);
								} else if (local45 == 16) {
									try {
										if (!aString233.startsWith("win")) {
											throw new Exception();
										}
										local242 = (String) local15.anObject9;
										if (!local242.startsWith("http://") && !local242.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(408) String local408 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local299 = 0; local299 < local242.length(); local299++) {
											if (local408.indexOf(local242.charAt(local299)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local242 + "\"");
										local15.anObject8 = null;
									} catch (@Pc(445) Exception local445) {
										local15.anObject8 = local445;
									}
								} else if (local45 == 20) {
									try {
										local471 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										local473 = Runtime.getRuntime();
										local479 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local471);
										local479.setAccessible(true);
										if (aString233.startsWith("win")) {
											if (aString229.startsWith("amd64") || aString229.startsWith("x86_64")) {
												local479.invoke(local473, local15.anObject9, method4727("jagmisc64.dll", this.anInt5650, this.aString230).toString());
											} else {
												local479.invoke(local473, local15.anObject9, method4727("jagmisc.dll", this.anInt5650, this.aString230).toString());
											}
										}
										local479.setAccessible(false);
									} catch (@Pc(544) Throwable local544) {
										local15.anObject8 = local544;
									}
								} else {
									throw new Exception();
								}
							}
						}
					}
				}
				local15.anInt5649 = 1;
			} catch (@Pc(877) ThreadDeath local877) {
				throw local877;
			} catch (@Pc(880) Throwable local880) {
				local15.anInt5649 = 2;
			}
		}
	}
}
