import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!pc")
public final class Class132 implements Runnable {

	@OriginalMember(owner = "loader!pc", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "loader!pc", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString17;

	@OriginalMember(owner = "loader!pc", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!pc", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString18;

	@OriginalMember(owner = "loader!pc", name = "u", descriptor = "Ljava/lang/String;")
	private static String aString19;

	@OriginalMember(owner = "loader!pc", name = "w", descriptor = "Ljava/lang/String;")
	private static String aString20;

	@OriginalMember(owner = "loader!pc", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString21;

	@OriginalMember(owner = "loader!pc", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString22;

	@OriginalMember(owner = "loader!pc", name = "g", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!pc", name = "j", descriptor = "I")
	private static int anInt4503 = 1;

	@OriginalMember(owner = "loader!pc", name = "m", descriptor = "[Lloader!fg;")
	private Class131[] aClass131Array1;

	@OriginalMember(owner = "loader!pc", name = "v", descriptor = "Lloader!ih;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!pc", name = "b", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "loader!pc", name = "o", descriptor = "Lloader!ud;")
	private Class133 aClass133_2 = null;

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "Lloader!fg;")
	private Class131 aClass131_3 = null;

	@OriginalMember(owner = "loader!pc", name = "k", descriptor = "Lloader!fg;")
	private Class131 aClass131_2 = null;

	@OriginalMember(owner = "loader!pc", name = "f", descriptor = "Lloader!fg;")
	private Class131 aClass131_1 = null;

	@OriginalMember(owner = "loader!pc", name = "s", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!pc", name = "i", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!pc", name = "l", descriptor = "Lloader!ud;")
	private Class133 aClass133_1 = null;

	@OriginalMember(owner = "loader!pc", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!pc", name = "p", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!pc", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "loader!pc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class132(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString17 = "Unknown";
		aString21 = "1.1";
		try {
			aString17 = System.getProperty("java.vendor");
			aString21 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString18 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString18 = "Unknown";
		}
		aString19 = aString18.toLowerCase();
		try {
			aString22 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString22 = "";
		}
		try {
			aString20 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString20 = "";
		}
		try {
			aString16 = System.getProperty("user.home");
			if (aString16 != null) {
				aString16 = aString16 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString16 == null) {
			aString16 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.method3571(arg3, arg2, arg4);
		this.aBoolean225 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3571(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString16, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(79) int local79 = 0; local79 < local70.length; local79++) {
				for (@Pc(89) int local89 = 0; local89 < local34.length; local89++) {
					try {
						@Pc(101) String local101 = local34[local89];
						if (local101.length() > 0 && !(new File(local101)).exists()) {
							continue;
						}
						@Pc(128) File local128 = new File(local101 + local70[local79]);
						@Pc(140) boolean local140;
						if (local72 == 1 && !local128.exists()) {
							local140 = local128.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(154) File local154;
						if (this.aClass131_2 == null) {
							try {
								local154 = new File(local128, "random.dat");
								if (local72 == 1 || local154.exists()) {
									this.aClass131_2 = new Class131(local154, "rw", 25L);
								}
							} catch (@Pc(172) Exception local172) {
								this.aClass131_2 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(225) int local225;
							try {
								local128 = new File(local128, arg0);
								if (local72 == 1 && !local128.exists()) {
									local140 = local128.mkdir();
									if (!local140) {
										continue;
									}
								}
								local154 = new File(local128, "main_file_cache.dat2");
								if (local72 == 0 && !local154.exists()) {
									continue;
								}
								this.aClass131_3 = new Class131(local154, "rw", 104857600L);
								this.aClass131Array1 = new Class131[27];
								for (local225 = 0; local225 < 27; local225++) {
									this.aClass131Array1[local225] = new Class131(new File(local128, "main_file_cache.idx" + local225), "rw", 1048576L);
								}
								this.aClass131_1 = new Class131(new File(local128, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local128;
							} catch (@Pc(275) Exception local275) {
								try {
									this.aClass131_3.method3551();
									for (local225 = 0; local225 < 27; local225++) {
										this.aClass131Array1[local225].method3551();
									}
									this.aClass131_1.method3551();
								} catch (@Pc(302) Exception local302) {
								}
								this.aClass131_3 = this.aClass131_1 = null;
								this.aFile5 = this.aFile6 = null;
								this.aClass131Array1 = null;
							}
						}
					} catch (@Pc(319) Exception local319) {
					}
					if (this.aClass131_2 != null && this.aFile6 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile6 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!pc", name = "b", descriptor = "(ILjava/lang/String;)Lloader!fg;")
	private Class131 method3573(@OriginalArg(1) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString16, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(43) int local43 = 0; local43 < local34.length; local43++) {
			@Pc(51) String local51 = local34[local43];
			if (local51.length() <= 0 || (new File(local51)).exists()) {
				try {
					return new Class131(new File(local51, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(86) Exception local86) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class133 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean225) {
						return;
					}
					if (this.aClass133_2 != null) {
						local17 = this.aClass133_2;
						this.aClass133_2 = this.aClass133_2.aClass133_3;
						if (this.aClass133_2 == null) {
							this.aClass133_1 = null;
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
				@Pc(47) int local47 = local17.anInt4504;
				if (local47 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject7), local17.anInt4505);
				} else if (local47 == 2) {
					@Pc(363) Thread local363 = new Thread((Runnable) local17.anObject7);
					local363.setDaemon(true);
					local363.start();
					local363.setPriority(local17.anInt4505);
					local17.anObject6 = local363;
				} else if (local47 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject7).openStream());
				} else {
					@Pc(90) Object[] local90;
					if (local47 == 8) {
						local90 = (Object[]) local17.anObject7;
						if (((Class) local90[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local90[0]).getDeclaredMethod((String) local90[1], (Class[]) local90[2]);
					} else if (local47 == 9) {
						local90 = (Object[]) local17.anObject7;
						if (((Class) local90[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local90[0]).getDeclaredField((String) local90[1]);
					} else {
						@Pc(165) String local165;
						if (local47 == 3) {
							local165 = (local17.anInt4505 >> 24 & 0xFF) + "." + (local17.anInt4505 >> 16 & 0xFF) + "." + (local17.anInt4505 >> 8 & 0xFF) + "." + (local17.anInt4505 & 0xFF);
							local17.anObject6 = InetAddress.getByName(local165).getHostName();
						} else if (local47 == 13) {
							@Pc(187) Class[] local187 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(189) Runtime local189 = Runtime.getRuntime();
							@Pc(195) Method local195 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local187);
							local195.setAccessible(true);
							local195.invoke(local189, local17.anObject7, "jawt");
							local195.setAccessible(false);
							@Pc(222) Method local222 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local187);
							local222.setAccessible(true);
							local222.invoke(local189, local17.anObject7, (new File(this.aFile5, "browsercontrol.dll")).toString());
							local222.setAccessible(false);
						} else if (local47 == 11) {
							@Pc(260) Field local260 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
							local260.setAccessible(true);
							@Pc(271) Vector local271 = (Vector) local260.get(((Class) local17.anObject7).getClassLoader());
							for (@Pc(273) int local273 = 0; local273 < local271.size(); local273++) {
								@Pc(281) Object local281 = local271.elementAt(local273);
								@Pc(288) Method local288 = local281.getClass().getDeclaredMethod("finalize");
								local288.setAccessible(true);
								local288.invoke(local281);
								local288.setAccessible(false);
							}
							local260.setAccessible(false);
						} else if (local47 == 12) {
							local165 = (String) local17.anObject7;
							@Pc(320) Class131 local320 = this.method3573(local165);
							local17.anObject6 = local320;
						} else {
							throw new Exception();
						}
					}
				}
				local17.anInt4506 = 1;
			} catch (@Pc(380) ThreadDeath local380) {
				throw local380;
			} catch (@Pc(383) Throwable local383) {
				local17.anInt4506 = 2;
			}
		}
	}
}
