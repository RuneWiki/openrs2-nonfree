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

@OriginalClass("loader!mi")
public final class Class131 implements Runnable {

	@OriginalMember(owner = "loader!mi", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "loader!mi", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "loader!mi", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString15;

	@OriginalMember(owner = "loader!mi", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!mi", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!mi", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "loader!mi", name = "h", descriptor = "I")
	private static int anInt4897 = 1;

	@OriginalMember(owner = "loader!mi", name = "m", descriptor = "[Lloader!ej;")
	private Class129[] aClass129Array1;

	@OriginalMember(owner = "loader!mi", name = "k", descriptor = "Lloader!uj;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!mi", name = "d", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "loader!mi", name = "g", descriptor = "Lloader!fa;")
	private Class130 aClass130_2 = null;

	@OriginalMember(owner = "loader!mi", name = "j", descriptor = "Lloader!fa;")
	private Class130 aClass130_3 = null;

	@OriginalMember(owner = "loader!mi", name = "q", descriptor = "Lloader!ej;")
	private Class129 aClass129_1 = null;

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!mi", name = "s", descriptor = "Lloader!ej;")
	private Class129 aClass129_3 = null;

	@OriginalMember(owner = "loader!mi", name = "t", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!mi", name = "c", descriptor = "Lloader!ej;")
	private Class129 aClass129_2 = null;

	@OriginalMember(owner = "loader!mi", name = "n", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!mi", name = "l", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!mi", name = "r", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "loader!mi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class131(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString14 = "1.1";
		aString13 = "Unknown";
		this.anApplet3 = arg1;
		try {
			aString13 = System.getProperty("java.vendor");
			aString14 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString16 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(49) Exception local49) {
			aString16 = "unknown";
		}
		try {
			aString15 = System.getProperty("user.home");
			if (aString15 != null) {
				aString15 = aString15 + "/";
			}
		} catch (@Pc(67) Exception local67) {
		}
		if (aString15 == null) {
			aString15 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(79) Throwable local79) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(107) Exception local107) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(134) Exception local134) {
		}
		this.method3863(arg2, arg3, arg4);
		this.aBoolean222 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!mi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class130 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean222) {
						return;
					}
					if (this.aClass130_2 != null) {
						local17 = this.aClass130_2;
						this.aClass130_2 = this.aClass130_2.aClass130_1;
						if (this.aClass130_2 == null) {
							this.aClass130_3 = null;
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
				@Pc(47) int local47 = local17.anInt4892;
				if (local47 == 1) {
					local17.anObject8 = new Socket(InetAddress.getByName((String) local17.anObject7), local17.anInt4893);
				} else if (local47 == 2) {
					@Pc(368) Thread local368 = new Thread((Runnable) local17.anObject7);
					local368.setDaemon(true);
					local368.start();
					local368.setPriority(local17.anInt4893);
					local17.anObject8 = local368;
				} else if (local47 == 4) {
					local17.anObject8 = new DataInputStream(((URL) local17.anObject7).openStream());
				} else {
					@Pc(94) Object[] local94;
					if (local47 == 8) {
						local94 = (Object[]) local17.anObject7;
						if (((Class) local94[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local94[0]).getDeclaredMethod((String) local94[1], (Class[]) local94[2]);
					} else if (local47 == 9) {
						local94 = (Object[]) local17.anObject7;
						if (((Class) local94[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local94[0]).getDeclaredField((String) local94[1]);
					} else {
						@Pc(276) String local276;
						if (local47 == 3) {
							local276 = (local17.anInt4893 >> 24 & 0xFF) + "." + (local17.anInt4893 >> 16 & 0xFF) + "." + (local17.anInt4893 >> 8 & 0xFF) + "." + (local17.anInt4893 & 0xFF);
							local17.anObject8 = InetAddress.getByName(local276).getHostName();
						} else if (local47 == 13) {
							@Pc(148) Class[] local148 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(150) Runtime local150 = Runtime.getRuntime();
							@Pc(156) Method local156 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local148);
							local156.setAccessible(true);
							local156.invoke(local150, local17.anObject7, "jawt");
							local156.setAccessible(false);
							@Pc(183) Method local183 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local148);
							local183.setAccessible(true);
							local183.invoke(local150, local17.anObject7, (new File(this.aFile5, "browsercontrol.dll")).toString());
							local183.setAccessible(false);
						} else if (local47 == 11) {
							@Pc(221) Field local221 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
							local221.setAccessible(true);
							@Pc(232) Vector local232 = (Vector) local221.get(((Class) local17.anObject7).getClassLoader());
							for (@Pc(234) int local234 = 0; local232.size() > local234; local234++) {
								@Pc(242) Object local242 = local232.elementAt(local234);
								@Pc(249) Method local249 = local242.getClass().getDeclaredMethod("finalize");
								local249.setAccessible(true);
								local249.invoke(local242);
								local249.setAccessible(false);
							}
							local221.setAccessible(false);
						} else if (local47 == 12) {
							local276 = (String) local17.anObject7;
							@Pc(281) Class129 local281 = this.method3859(local276);
							local17.anObject8 = local281;
						} else {
							throw new Exception();
						}
					}
				}
				local17.anInt4894 = 1;
			} catch (@Pc(385) ThreadDeath local385) {
				throw local385;
			} catch (@Pc(388) Throwable local388) {
				local17.anInt4894 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!ej;")
	private Class129 method3859(@OriginalArg(0) String arg0) {
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", aString15, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
			@Pc(52) String local52 = local42[local44];
			if (local52.length() <= 0 || (new File(local52)).exists()) {
				try {
					return new Class129(new File(local52, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(85) Exception local85) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!mi", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3863(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString15, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(72) String[] local72 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(74) int local74 = 0; local74 < 2; local74++) {
			for (@Pc(81) int local81 = 0; local81 < local72.length; local81++) {
				for (@Pc(91) int local91 = 0; local91 < local34.length; local91++) {
					try {
						@Pc(99) String local99 = local34[local91];
						if (local99.length() > 0 && !(new File(local99)).exists()) {
							continue;
						}
						@Pc(126) File local126 = new File(local99 + local72[local81]);
						@Pc(136) boolean local136;
						if (local74 == 1 && !local126.exists()) {
							local136 = local126.mkdir();
							if (!local136) {
								continue;
							}
						}
						@Pc(151) File local151;
						if (this.aClass129_1 == null) {
							try {
								local151 = new File(local126, "random.dat");
								if (local74 == 1 || local151.exists()) {
									this.aClass129_1 = new Class129(local151, "rw", 25L);
								}
							} catch (@Pc(169) Exception local169) {
								this.aClass129_1 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(222) int local222;
							try {
								local126 = new File(local126, arg1);
								if (local74 == 1 && !local126.exists()) {
									local136 = local126.mkdir();
									if (!local136) {
										continue;
									}
								}
								local151 = new File(local126, "main_file_cache.dat2");
								if (local74 == 0 && !local151.exists()) {
									continue;
								}
								this.aClass129_3 = new Class129(local151, "rw", 104857600L);
								this.aClass129Array1 = new Class129[27];
								for (local222 = 0; local222 < 27; local222++) {
									this.aClass129Array1[local222] = new Class129(new File(local126, "main_file_cache.idx" + local222), "rw", 1048576L);
								}
								this.aClass129_2 = new Class129(new File(local126, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local126;
							} catch (@Pc(272) Exception local272) {
								try {
									this.aClass129_3.method3843();
									for (local222 = 0; local222 < 27; local222++) {
										this.aClass129Array1[local222].method3843();
									}
									this.aClass129_2.method3843();
								} catch (@Pc(299) Exception local299) {
								}
								this.aClass129Array1 = null;
								this.aClass129_3 = this.aClass129_2 = null;
								this.aFile5 = this.aFile6 = null;
							}
						}
					} catch (@Pc(316) Exception local316) {
					}
					if (this.aClass129_1 != null && this.aFile6 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile6 == null) {
			throw new RuntimeException();
		}
	}
}
