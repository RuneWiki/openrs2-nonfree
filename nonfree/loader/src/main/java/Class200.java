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

@OriginalClass("loader!pm")
public final class Class200 implements Runnable {

	@OriginalMember(owner = "loader!pm", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString383;

	@OriginalMember(owner = "loader!pm", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString384;

	@OriginalMember(owner = "loader!pm", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString385;

	@OriginalMember(owner = "loader!pm", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString386;

	@OriginalMember(owner = "loader!pm", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString388;

	@OriginalMember(owner = "loader!pm", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString389;

	@OriginalMember(owner = "loader!pm", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString390;

	@OriginalMember(owner = "loader!pm", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!pm", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!pm", name = "a", descriptor = "I")
	private static int anInt6110 = 1;

	@OriginalMember(owner = "loader!pm", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!pm", name = "s", descriptor = "J")
	private static volatile long aLong223 = 0L;

	@OriginalMember(owner = "loader!pm", name = "p", descriptor = "Lloader!le;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!pm", name = "i", descriptor = "Lloader!kd;")
	private Class199 aClass199_1 = null;

	@OriginalMember(owner = "loader!pm", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!pm", name = "j", descriptor = "Lloader!kd;")
	private Class199 aClass199_2 = null;

	@OriginalMember(owner = "loader!pm", name = "b", descriptor = "Lloader!kd;")
	private Class199 aClass199_3 = null;

	@OriginalMember(owner = "loader!pm", name = "c", descriptor = "Z")
	private boolean aBoolean428 = false;

	@OriginalMember(owner = "loader!pm", name = "k", descriptor = "Lloader!vk;")
	private Class201 aClass201_1 = null;

	@OriginalMember(owner = "loader!pm", name = "y", descriptor = "Lloader!vk;")
	private Class201 aClass201_2 = null;

	@OriginalMember(owner = "loader!pm", name = "x", descriptor = "I")
	private int anInt6109;

	@OriginalMember(owner = "loader!pm", name = "w", descriptor = "Ljava/lang/String;")
	private String aString387;

	@OriginalMember(owner = "loader!pm", name = "v", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!pm", name = "u", descriptor = "[Lloader!kd;")
	private Class199[] aClass199Array1;

	@OriginalMember(owner = "loader!pm", name = "z", descriptor = "Lloader!c;")
	private Class195 aClass195_1;

	@OriginalMember(owner = "loader!pm", name = "h", descriptor = "Lloader!e;")
	private Class196 aClass196_1;

	@OriginalMember(owner = "loader!pm", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!pm", name = "c", descriptor = "(Ljava/lang/String;B)Lloader!kd;")
	private static Class199 method4907(@OriginalArg(0) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString386, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(41) int local41 = 0; local41 < local34.length; local41++) {
			@Pc(49) String local49 = local34[local41];
			if (local49.length() <= 0 || (new File(local49)).exists()) {
				try {
					return new Class199(new File(local49, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(82) Exception local82) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!pm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)Ljava/io/File;")
	public static File method4910(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(10) File local10 = (File) aHashtable2.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(49) String[] local49 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString386, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(83) int local83 = 0; local83 < local74.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local49.length; local93++) {
					@Pc(131) String local131 = local49[local93] + local74[local83] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local76 != 0 || local138.exists()) {
							@Pc(151) String local151 = local49[local93];
							if (local76 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local49[local93] + local74[local83])).mkdir();
								if (arg2 != null) {
									(new File(local49[local93] + local74[local83] + "/" + arg2)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(218) int local218 = local133.read();
								local133.seek(0L);
								local133.write(local218);
								local133.seek(0L);
								local133.close();
								aHashtable2.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(246) Exception local246) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!pm", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class200(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString385 = "1.1";
		this.anInt6109 = arg1;
		this.aString387 = arg2;
		aString384 = "Unknown";
		this.anApplet3 = arg0;
		try {
			aString384 = System.getProperty("java.vendor");
			aString385 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString388 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString388 = "Unknown";
		}
		aString390 = aString388.toLowerCase();
		try {
			aString383 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString383 = "";
		}
		try {
			aString389 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString389 = "";
		}
		try {
			aString386 = System.getProperty("user.home");
			if (aString386 != null) {
				aString386 = aString386 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString386 == null) {
			aString386 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
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
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass199_2 = new Class199(method4910("random.dat", this.anInt6109, null), "rw", 25L);
		this.aClass199_1 = new Class199(method4910("main_file_cache.dat2", this.anInt6109, this.aString387), "rw", 104857600L);
		this.aClass199_3 = new Class199(method4910("main_file_cache.idx255", this.anInt6109, this.aString387), "rw", 1048576L);
		this.aClass199Array1 = new Class199[arg3];
		for (@Pc(198) int local198 = 0; local198 < arg3; local198++) {
			this.aClass199Array1[local198] = new Class199(method4910("main_file_cache.idx" + local198, this.anInt6109, this.aString387), "rw", 1048576L);
		}
		try {
			this.aClass195_1 = new Class195();
		} catch (@Pc(237) Throwable local237) {
		}
		try {
			this.aClass196_1 = new Class196();
		} catch (@Pc(244) Throwable local244) {
		}
		@Pc(247) ThreadGroup local247 = Thread.currentThread().getThreadGroup();
		for (@Pc(250) ThreadGroup local250 = local247.getParent(); local250 != null; local250 = local250.getParent()) {
			local247 = local250;
		}
		@Pc(262) Thread[] local262 = new Thread[1000];
		local247.enumerate(local262);
		for (@Pc(268) int local268 = 0; local268 < local262.length; local268++) {
			if (local262[local268] != null && local262[local268].getName().startsWith("AWT")) {
				local262[local268].setPriority(1);
			}
		}
		this.aBoolean428 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!pm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class201 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean428) {
						return;
					}
					if (this.aClass201_1 != null) {
						local16 = this.aClass201_1;
						this.aClass201_1 = this.aClass201_1.aClass201_3;
						if (this.aClass201_1 == null) {
							this.aClass201_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local16.anInt6112;
				if (local46 == 1) {
					if (aLong223 > Class198.method4880()) {
						throw new IOException();
					}
					local16.anObject8 = new Socket(InetAddress.getByName((String) local16.anObject9), local16.anInt6113);
				} else if (local46 == 2) {
					@Pc(843) Thread local843 = new Thread((Runnable) local16.anObject9);
					local843.setDaemon(true);
					local843.start();
					local843.setPriority(local16.anInt6113);
					local16.anObject8 = local843;
				} else if (local46 == 4) {
					if (Class198.method4880() < aLong223) {
						throw new IOException();
					}
					local16.anObject8 = new DataInputStream(((URL) local16.anObject9).openStream());
				} else {
					@Pc(93) Object[] local93;
					if (local46 == 8) {
						local93 = (Object[]) local16.anObject9;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local93[0]).getDeclaredMethod((String) local93[1], (Class[]) local93[2]);
					} else if (local46 == 9) {
						local93 = (Object[]) local16.anObject9;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local93[0]).getDeclaredField((String) local93[1]);
					} else if (local46 == 18) {
						@Pc(797) Clipboard local797 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject8 = local797.getContents(null);
					} else if (local46 == 19) {
						@Pc(126) Transferable local126 = (Transferable) local16.anObject9;
						@Pc(129) Clipboard local129 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local129.setContents(local126, null);
					} else {
						@Pc(188) String local188;
						if (local46 == 3) {
							if (Class198.method4880() < aLong223) {
								throw new IOException();
							}
							local188 = (local16.anInt6113 >> 24 & 0xFF) + "." + (local16.anInt6113 >> 16 & 0xFF) + "." + (local16.anInt6113 >> 8 & 0xFF) + "." + (local16.anInt6113 & 0xFF);
							local16.anObject8 = InetAddress.getByName(local188).getHostName();
						} else if (local46 == 5) {
							local16.anObject8 = this.aClass195_1.method4870();
						} else if (local46 == 6) {
							@Pc(214) Frame local214 = new Frame("Jagex Full Screen");
							local16.anObject8 = local214;
							local214.setResizable(false);
							this.aClass195_1.method4869(local16.anInt6113 & 0xFFFF, local16.anInt6113 >>> 16, local16.anInt6114 >> 16, local214, local16.anInt6114 & 0xFFFF);
						} else if (local46 == 7) {
							this.aClass195_1.method4868();
						} else {
							@Pc(386) Class[] local386;
							@Pc(388) Runtime local388;
							@Pc(394) Method local394;
							if (local46 == 10) {
								local386 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local388 = Runtime.getRuntime();
								if (!aString390.startsWith("mac")) {
									local394 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local386);
									local394.setAccessible(true);
									local394.invoke(local388, local16.anObject9, "jawt");
									local394.setAccessible(false);
								}
								local394 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local386);
								local394.setAccessible(true);
								if (aString390.startsWith("linux") || aString390.startsWith("sunos")) {
									local394.invoke(local388, local16.anObject9, method4910("libjaggl_dri.so", this.anInt6109, this.aString387).toString());
									@Pc(690) Class local690 = ((Class) local16.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
									local690.getMethod("begin").invoke(null);
									local394.invoke(local388, local16.anObject9, method4910("libjaggl.so", this.anInt6109, this.aString387).toString());
									local690.getMethod("end").invoke(null);
								} else if (aString390.startsWith("mac")) {
									local394.invoke(local388, local16.anObject9, method4910("libjaggl.jnilib", this.anInt6109, this.aString387).toString());
								} else if (aString390.startsWith("win")) {
									local394.invoke(local388, local16.anObject9, method4910("jaggl.dll", this.anInt6109, this.aString387).toString());
								} else {
									throw new Exception();
								}
								local394.setAccessible(false);
							} else {
								@Pc(325) int local325;
								if (local46 == 11) {
									@Pc(529) Field local529 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local529.setAccessible(true);
									@Pc(540) Vector local540 = (Vector) local529.get(((Class) local16.anObject9).getClassLoader());
									for (local325 = 0; local325 < local540.size(); local325++) {
										@Pc(554) Object local554 = local540.elementAt(local325);
										@Pc(561) Method local561 = local554.getClass().getDeclaredMethod("finalize");
										local561.setAccessible(true);
										local561.invoke(local554);
										local561.setAccessible(false);
										@Pc(578) Field local578 = local554.getClass().getDeclaredField("handle");
										local578.setAccessible(true);
										local578.set(local554, Integer.valueOf(0));
										local578.setAccessible(false);
									}
									local529.setAccessible(false);
								} else if (local46 == 12) {
									local188 = (String) local16.anObject9;
									@Pc(520) Class199 local520 = method4907(local188);
									local16.anObject8 = local520;
								} else if (local46 == 14) {
									@Pc(273) int local273 = local16.anInt6113;
									@Pc(276) int local276 = local16.anInt6114;
									this.aClass196_1.method4874(local276, local273);
								} else if (local46 == 15) {
									@Pc(495) Component local495 = (Component) local16.anObject9;
									@Pc(505) boolean local505 = local16.anInt6113 != 0;
									this.aClass196_1.method4872(local505, local495);
								} else if (local46 == 17) {
									local93 = (Object[]) local16.anObject9;
									this.aClass196_1.method4873(local16.anInt6113, local16.anInt6114, (Point) local93[2], (int[]) local93[1], (Component) local93[0]);
								} else if (local46 == 16) {
									try {
										if (!aString390.startsWith("win")) {
											throw new Exception();
										}
										local188 = (String) local16.anObject9;
										if (!local188.startsWith("http://") && !local188.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(323) String local323 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local325 = 0; local188.length() > local325; local325++) {
											if (local323.indexOf(local188.charAt(local325)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local188 + "\"");
										local16.anObject8 = null;
									} catch (@Pc(362) Exception local362) {
										local16.anObject8 = local362;
									}
								} else if (local46 == 20) {
									try {
										local386 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										local388 = Runtime.getRuntime();
										local394 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local386);
										local394.setAccessible(true);
										if (aString390.startsWith("win")) {
											if (aString383.startsWith("amd64") || aString383.startsWith("x86_64")) {
												local394.invoke(local388, local16.anObject9, method4910("jagmisc64.dll", this.anInt6109, this.aString387).toString());
											} else {
												local394.invoke(local388, local16.anObject9, method4910("jagmisc.dll", this.anInt6109, this.aString387).toString());
											}
										}
										local394.setAccessible(false);
									} catch (@Pc(460) Throwable local460) {
										local16.anObject8 = local460;
									}
								} else {
									throw new Exception();
								}
							}
						}
					}
				}
				local16.anInt6111 = 1;
			} catch (@Pc(881) ThreadDeath local881) {
				throw local881;
			} catch (@Pc(884) Throwable local884) {
				local16.anInt6111 = 2;
			}
		}
	}
}
