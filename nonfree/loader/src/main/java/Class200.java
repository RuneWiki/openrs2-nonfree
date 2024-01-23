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

@OriginalClass("loader!la")
public final class Class200 implements Runnable {

	@OriginalMember(owner = "loader!la", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString213;

	@OriginalMember(owner = "loader!la", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString214;

	@OriginalMember(owner = "loader!la", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString215;

	@OriginalMember(owner = "loader!la", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString216;

	@OriginalMember(owner = "loader!la", name = "w", descriptor = "Ljava/lang/String;")
	private static String aString217;

	@OriginalMember(owner = "loader!la", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString218;

	@OriginalMember(owner = "loader!la", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString219;

	@OriginalMember(owner = "loader!la", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!la", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!la", name = "p", descriptor = "I")
	private static int anInt6097 = 1;

	@OriginalMember(owner = "loader!la", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!la", name = "v", descriptor = "J")
	private static volatile long aLong216 = 0L;

	@OriginalMember(owner = "loader!la", name = "z", descriptor = "Lloader!rd;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!la", name = "s", descriptor = "Lloader!me;")
	private Class202 aClass202_1 = null;

	@OriginalMember(owner = "loader!la", name = "n", descriptor = "Z")
	private boolean aBoolean406 = false;

	@OriginalMember(owner = "loader!la", name = "r", descriptor = "Lloader!mc;")
	private Class201 aClass201_1 = null;

	@OriginalMember(owner = "loader!la", name = "j", descriptor = "Lloader!mc;")
	private Class201 aClass201_2 = null;

	@OriginalMember(owner = "loader!la", name = "g", descriptor = "Lloader!mc;")
	private Class201 aClass201_3 = null;

	@OriginalMember(owner = "loader!la", name = "A", descriptor = "Lloader!me;")
	private Class202 aClass202_2 = null;

	@OriginalMember(owner = "loader!la", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!la", name = "d", descriptor = "I")
	private int anInt6096;

	@OriginalMember(owner = "loader!la", name = "b", descriptor = "Ljava/lang/String;")
	private String aString212;

	@OriginalMember(owner = "loader!la", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!la", name = "i", descriptor = "[Lloader!mc;")
	private Class201[] aClass201Array1;

	@OriginalMember(owner = "loader!la", name = "y", descriptor = "Lloader!c;")
	private Class198 aClass198_1;

	@OriginalMember(owner = "loader!la", name = "x", descriptor = "Lloader!b;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "loader!la", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!la", name = "a", descriptor = "(ILjava/lang/String;)Lloader!mc;")
	private static Class201 method4796(@OriginalArg(1) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString217, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(42) int local42 = 0; local42 < local34.length; local42++) {
			@Pc(50) String local50 = local34[local42];
			if (local50.length() <= 0 || (new File(local50)).exists()) {
				try {
					return new Class201(new File(local50, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(86) Exception local86) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!la", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method4802(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString217, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(85) int local85 = 0; local85 < local76.length; local85++) {
				for (@Pc(95) int local95 = 0; local95 < local51.length; local95++) {
					@Pc(101) RandomAccessFile local101 = null;
					@Pc(131) String local131 = local51[local95] + local76[local85] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					try {
						@Pc(136) File local136 = new File(local131);
						if (local78 != 0 || local136.exists()) {
							@Pc(149) String local149 = local51[local95];
							if (local78 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local51[local95] + local76[local85])).mkdir();
								if (arg1 != null) {
									(new File(local51[local95] + local76[local85] + "/" + arg1)).mkdir();
								}
								local101 = new RandomAccessFile(local136, "rw");
								@Pc(218) int local218 = local101.read();
								local101.seek(0L);
								local101.write(local218);
								local101.seek(0L);
								local101.close();
								aHashtable2.put(arg0, local136);
								return local136;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local101 != null) {
								local101.close();
							}
						} catch (@Pc(246) Exception local246) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!la", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class200(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt6096 = arg1;
		aString216 = "1.1";
		this.aString212 = arg2;
		aString213 = "Unknown";
		this.anApplet2 = arg0;
		try {
			aString213 = System.getProperty("java.vendor");
			aString216 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString219 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString219 = "Unknown";
		}
		aString214 = aString219.toLowerCase();
		try {
			aString218 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString218 = "";
		}
		try {
			aString215 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString215 = "";
		}
		try {
			aString217 = System.getProperty("user.home");
			if (aString217 != null) {
				aString217 = aString217 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString217 == null) {
			aString217 = "~/";
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
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass201_3 = new Class201(method4802("random.dat", null, this.anInt6096), "rw", 25L);
		this.aClass201_1 = new Class201(method4802("main_file_cache.dat2", this.aString212, this.anInt6096), "rw", 209715200L);
		this.aClass201_2 = new Class201(method4802("main_file_cache.idx255", this.aString212, this.anInt6096), "rw", 1048576L);
		this.aClass201Array1 = new Class201[arg3];
		for (@Pc(199) int local199 = 0; local199 < arg3; local199++) {
			this.aClass201Array1[local199] = new Class201(method4802("main_file_cache.idx" + local199, this.aString212, this.anInt6096), "rw", 1048576L);
		}
		try {
			this.aClass198_1 = new Class198();
		} catch (@Pc(234) Throwable local234) {
		}
		try {
			this.aClass197_1 = new Class197();
		} catch (@Pc(241) Throwable local241) {
		}
		@Pc(244) ThreadGroup local244 = Thread.currentThread().getThreadGroup();
		for (@Pc(247) ThreadGroup local247 = local244.getParent(); local247 != null; local247 = local247.getParent()) {
			local244 = local247;
		}
		@Pc(259) Thread[] local259 = new Thread[1000];
		local244.enumerate(local259);
		for (@Pc(265) int local265 = 0; local265 < local259.length; local265++) {
			if (local259[local265] != null && local259[local265].getName().startsWith("AWT")) {
				local259[local265].setPriority(1);
			}
		}
		this.aBoolean406 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!la", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class202 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean406) {
						return;
					}
					if (this.aClass202_2 != null) {
						local18 = this.aClass202_2;
						this.aClass202_2 = this.aClass202_2.aClass202_3;
						if (this.aClass202_2 == null) {
							this.aClass202_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(36) InterruptedException local36) {
					}
				}
			}
			try {
				@Pc(48) int local48 = local18.anInt6103;
				if (local48 == 1) {
					if (Class203.method4820() < aLong216) {
						throw new IOException();
					}
					local18.anObject9 = new Socket(InetAddress.getByName((String) local18.anObject8), local18.anInt6105);
				} else if (local48 == 2) {
					@Pc(63) Thread local63 = new Thread((Runnable) local18.anObject8);
					local63.setDaemon(true);
					local63.start();
					local63.setPriority(local18.anInt6105);
					local18.anObject9 = local63;
				} else if (local48 == 4) {
					if (aLong216 > Class203.method4820()) {
						throw new IOException();
					}
					local18.anObject9 = new DataInputStream(((URL) local18.anObject8).openStream());
				} else {
					@Pc(214) Object[] local214;
					if (local48 == 8) {
						local214 = (Object[]) local18.anObject8;
						if (((Class) local214[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject9 = ((Class) local214[0]).getDeclaredMethod((String) local214[1], (Class[]) local214[2]);
					} else if (local48 == 9) {
						local214 = (Object[]) local18.anObject8;
						if (((Class) local214[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject9 = ((Class) local214[0]).getDeclaredField((String) local214[1]);
					} else if (local48 == 18) {
						@Pc(760) Clipboard local760 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject9 = local760.getContents(null);
					} else if (local48 == 19) {
						@Pc(99) Transferable local99 = (Transferable) local18.anObject8;
						@Pc(102) Clipboard local102 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local102.setContents(local99, null);
					} else {
						@Pc(157) String local157;
						if (local48 == 3) {
							if (aLong216 > Class203.method4820()) {
								throw new IOException();
							}
							local157 = (local18.anInt6105 >> 24 & 0xFF) + "." + (local18.anInt6105 >> 16 & 0xFF) + "." + (local18.anInt6105 >> 8 & 0xFF) + "." + (local18.anInt6105 & 0xFF);
							local18.anObject9 = InetAddress.getByName(local157).getHostName();
						} else if (local48 == 5) {
							local18.anObject9 = this.aClass198_1.method4771();
						} else if (local48 == 6) {
							@Pc(722) Frame local722 = new Frame("Jagex Full Screen");
							local18.anObject9 = local722;
							local722.setResizable(false);
							this.aClass198_1.method4773(local18.anInt6102 & 0xFFFF, local18.anInt6102 >> 16, local18.anInt6105 & 0xFFFF, local722, local18.anInt6105 >>> 16);
						} else if (local48 == 7) {
							this.aClass198_1.method4772();
						} else {
							@Pc(330) Class[] local330;
							@Pc(332) Runtime local332;
							@Pc(338) Method local338;
							if (local48 == 10) {
								local330 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local332 = Runtime.getRuntime();
								if (!aString214.startsWith("mac")) {
									local338 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local330);
									local338.setAccessible(true);
									local338.invoke(local332, local18.anObject8, "jawt");
									local338.setAccessible(false);
								}
								local338 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local330);
								local338.setAccessible(true);
								if (aString214.startsWith("linux") || aString214.startsWith("sunos")) {
									local338.invoke(local332, local18.anObject8, method4802("libjaggl_dri.so", this.aString212, this.anInt6096).toString());
									@Pc(613) Class local613 = ((Class) local18.anObject8).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
									local613.getMethod("begin").invoke(null);
									local338.invoke(local332, local18.anObject8, method4802("libjaggl.so", this.aString212, this.anInt6096).toString());
									local613.getMethod("end").invoke(null);
								} else if (aString214.startsWith("mac")) {
									local338.invoke(local332, local18.anObject8, method4802("libjaggl.jnilib", this.aString212, this.anInt6096).toString());
								} else if (aString214.startsWith("win")) {
									local338.invoke(local332, local18.anObject8, method4802("jaggl.dll", this.aString212, this.anInt6096).toString());
								} else {
									throw new Exception();
								}
								local338.setAccessible(false);
							} else {
								@Pc(268) int local268;
								if (local48 == 11) {
									@Pc(457) Field local457 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local457.setAccessible(true);
									@Pc(468) Vector local468 = (Vector) local457.get(((Class) local18.anObject8).getClassLoader());
									for (local268 = 0; local468.size() > local268; local268++) {
										@Pc(478) Object local478 = local468.elementAt(local268);
										@Pc(485) Method local485 = local478.getClass().getDeclaredMethod("finalize");
										local485.setAccessible(true);
										local485.invoke(local478);
										local485.setAccessible(false);
										@Pc(502) Field local502 = local478.getClass().getDeclaredField("handle");
										local502.setAccessible(true);
										local502.set(local478, Integer.valueOf(0));
										local502.setAccessible(false);
									}
									local457.setAccessible(false);
								} else if (local48 == 12) {
									local157 = (String) local18.anObject8;
									@Pc(448) Class201 local448 = method4796(local157);
									local18.anObject9 = local448;
								} else if (local48 == 14) {
									@Pc(430) int local430 = local18.anInt6102;
									@Pc(433) int local433 = local18.anInt6105;
									this.aClass197_1.method4767(local433, local430);
								} else if (local48 == 15) {
									@Pc(412) Component local412 = (Component) local18.anObject8;
									@Pc(420) boolean local420 = local18.anInt6105 != 0;
									this.aClass197_1.method4768(local420, local412);
								} else if (local48 == 17) {
									local214 = (Object[]) local18.anObject8;
									this.aClass197_1.method4769((Component) local214[0], local18.anInt6105, (int[]) local214[1], local18.anInt6102, (Point) local214[2]);
								} else if (local48 == 16) {
									try {
										if (!aString214.startsWith("win")) {
											throw new Exception();
										}
										local157 = (String) local18.anObject8;
										if (!local157.startsWith("http://") && !local157.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(266) String local266 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local268 = 0; local268 < local157.length(); local268++) {
											if (local266.indexOf(local157.charAt(local268)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local157 + "\"");
										local18.anObject9 = null;
									} catch (@Pc(304) Exception local304) {
										local18.anObject9 = local304;
									}
								} else if (local48 == 20) {
									try {
										local330 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										local332 = Runtime.getRuntime();
										local338 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local330);
										local338.setAccessible(true);
										if (aString214.startsWith("win")) {
											if (aString218.startsWith("amd64") || aString218.startsWith("x86_64")) {
												local338.invoke(local332, local18.anObject8, method4802("jagmisc64.dll", this.aString212, this.anInt6096).toString());
											} else {
												local338.invoke(local332, local18.anObject8, method4802("jagmisc.dll", this.aString212, this.anInt6096).toString());
											}
										}
										local338.setAccessible(false);
									} catch (@Pc(404) Throwable local404) {
										local18.anObject9 = local404;
									}
								} else {
									throw new Exception();
								}
							}
						}
					}
				}
				local18.anInt6104 = 1;
			} catch (@Pc(874) ThreadDeath local874) {
				throw local874;
			} catch (@Pc(877) Throwable local877) {
				local18.anInt6104 = 2;
			}
		}
	}
}
