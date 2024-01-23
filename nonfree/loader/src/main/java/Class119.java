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

@OriginalClass("loader!lj")
public final class Class119 implements Runnable {

	@OriginalMember(owner = "loader!lj", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString13;

	@OriginalMember(owner = "loader!lj", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "loader!lj", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString15;

	@OriginalMember(owner = "loader!lj", name = "m", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!lj", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "loader!lj", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!lj", name = "c", descriptor = "I")
	private static int anInt4929 = 1;

	@OriginalMember(owner = "loader!lj", name = "h", descriptor = "J")
	private static long aLong192 = Long.MAX_VALUE;

	@OriginalMember(owner = "loader!lj", name = "p", descriptor = "[Lloader!he;")
	private Class118[] aClass118Array1;

	@OriginalMember(owner = "loader!lj", name = "q", descriptor = "Lloader!i;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!lj", name = "l", descriptor = "Lloader!he;")
	private Class118 aClass118_1 = null;

	@OriginalMember(owner = "loader!lj", name = "b", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "loader!lj", name = "t", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!lj", name = "d", descriptor = "Lloader!h;")
	private Class117 aClass117_2 = null;

	@OriginalMember(owner = "loader!lj", name = "o", descriptor = "Lloader!he;")
	private Class118 aClass118_2 = null;

	@OriginalMember(owner = "loader!lj", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!lj", name = "g", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!lj", name = "n", descriptor = "Lloader!h;")
	private Class117 aClass117_3 = null;

	@OriginalMember(owner = "loader!lj", name = "k", descriptor = "Lloader!he;")
	private Class118 aClass118_3 = null;

	@OriginalMember(owner = "loader!lj", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!lj", name = "u", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "loader!lj", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class119(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString14 = "1.1";
		this.anApplet2 = arg1;
		aString16 = "Unknown";
		try {
			aString16 = System.getProperty("java.vendor");
			aString14 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString15 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(49) Exception local49) {
			aString15 = "unknown";
		}
		try {
			aString13 = System.getProperty("user.home");
			if (aString13 != null) {
				aString13 = aString13 + "/";
			}
		} catch (@Pc(67) Exception local67) {
		}
		if (aString13 == null) {
			aString13 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(78) Throwable local78) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(105) Exception local105) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(133) Exception local133) {
		}
		aLong192 = 67108864L;
		try {
			@Pc(137) Runtime local137 = Runtime.getRuntime();
			aLong192 = (Long) Class.forName("java.lang.Runtime").getMethod("maxMemory").invoke(local137);
		} catch (@Pc(152) Exception local152) {
		}
		this.method4015(arg4, arg3, arg2);
		this.aBoolean215 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!lj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class117 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean215) {
						return;
					}
					if (this.aClass117_3 != null) {
						local17 = this.aClass117_3;
						this.aClass117_3 = this.aClass117_3.aClass117_1;
						if (this.aClass117_3 == null) {
							this.aClass117_2 = null;
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
				@Pc(47) int local47 = local17.anInt4928;
				if (local47 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt4926);
				} else if (local47 == 2) {
					@Pc(363) Thread local363 = new Thread((Runnable) local17.anObject6);
					local363.setDaemon(true);
					local363.start();
					local363.setPriority(local17.anInt4926);
					local17.anObject5 = local363;
				} else if (local47 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(302) Object[] local302;
					if (local47 == 8) {
						local302 = (Object[]) local17.anObject6;
						if (((Class) local302[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local302[0]).getDeclaredMethod((String) local302[1], (Class[]) local302[2]);
					} else if (local47 == 9) {
						local302 = (Object[]) local17.anObject6;
						if (((Class) local302[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local302[0]).getDeclaredField((String) local302[1]);
					} else {
						@Pc(132) String local132;
						if (local47 == 3) {
							local132 = (local17.anInt4926 >> 24 & 0xFF) + "." + (local17.anInt4926 >> 16 & 0xFF) + "." + (local17.anInt4926 >> 8 & 0xFF) + "." + (local17.anInt4926 & 0xFF);
							local17.anObject5 = InetAddress.getByName(local132).getHostName();
						} else if (local47 == 13) {
							@Pc(154) Class[] local154 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(156) Runtime local156 = Runtime.getRuntime();
							@Pc(162) Method local162 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local154);
							local162.setAccessible(true);
							local162.invoke(local156, local17.anObject6, "jawt");
							local162.setAccessible(false);
							@Pc(189) Method local189 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local154);
							local189.setAccessible(true);
							local189.invoke(local156, local17.anObject6, (new File(this.aFile6, "browsercontrol.dll")).toString());
							local189.setAccessible(false);
						} else if (local47 == 11) {
							@Pc(247) Field local247 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
							local247.setAccessible(true);
							@Pc(258) Vector local258 = (Vector) local247.get(((Class) local17.anObject6).getClassLoader());
							for (@Pc(260) int local260 = 0; local260 < local258.size(); local260++) {
								@Pc(272) Object local272 = local258.elementAt(local260);
								@Pc(279) Method local279 = local272.getClass().getDeclaredMethod("finalize");
								local279.setAccessible(true);
								local279.invoke(local272);
								local279.setAccessible(false);
							}
							local247.setAccessible(false);
						} else if (local47 == 12) {
							local132 = (String) local17.anObject6;
							@Pc(234) Class118 local234 = this.method4013(local132);
							local17.anObject5 = local234;
						} else {
							throw new Exception();
						}
					}
				}
				local17.anInt4927 = 1;
			} catch (@Pc(380) ThreadDeath local380) {
				throw local380;
			} catch (@Pc(383) Throwable local383) {
				local17.anInt4927 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!lj", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!he;")
	private Class118 method4013(@OriginalArg(0) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString13, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(43) int local43 = 0; local43 < local34.length; local43++) {
			@Pc(55) String local55 = local34[local43];
			if (local55.length() <= 0 || (new File(local55)).exists()) {
				try {
					return new Class118(new File(local55, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(90) Exception local90) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!lj", name = "a", descriptor = "(BILjava/lang/String;I)V")
	private void method4015(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString13, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(82) int local82 = 0; local82 < local73.length; local82++) {
				for (@Pc(88) int local88 = 0; local88 < local48.length; local88++) {
					try {
						@Pc(100) String local100 = local48[local88];
						if (local100.length() > 0 && !(new File(local100)).exists()) {
							continue;
						}
						@Pc(128) File local128 = new File(local100 + local73[local82]);
						@Pc(137) boolean local137;
						if (local75 == 1 && !local128.exists()) {
							local137 = local128.mkdir();
							if (!local137) {
								continue;
							}
						}
						@Pc(152) File local152;
						if (this.aClass118_2 == null) {
							try {
								local152 = new File(local128, "random.dat");
								if (local75 == 1 || local152.exists()) {
									this.aClass118_2 = new Class118(local152, "rw", 25L);
								}
							} catch (@Pc(171) Exception local171) {
								this.aClass118_2 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(229) int local229;
							try {
								local128 = new File(local128, arg1);
								if (local75 == 1 && !local128.exists()) {
									local137 = local128.mkdir();
									if (!local137) {
										continue;
									}
								}
								local152 = new File(local128, "main_file_cache.dat2");
								if (local75 == 0 && !local152.exists()) {
									continue;
								}
								this.aClass118_3 = new Class118(local152, "rw", 104857600L);
								this.aClass118Array1 = new Class118[27];
								for (local229 = 0; local229 < 27; local229++) {
									this.aClass118Array1[local229] = new Class118(new File(local128, "main_file_cache.idx" + local229), "rw", 1048576L);
								}
								this.aClass118_1 = new Class118(new File(local128, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local128;
							} catch (@Pc(279) Exception local279) {
								try {
									this.aClass118_3.method4001();
									for (local229 = 0; local229 < 27; local229++) {
										this.aClass118Array1[local229].method4001();
									}
									this.aClass118_1.method4001();
								} catch (@Pc(306) Exception local306) {
								}
								this.aClass118_3 = this.aClass118_1 = null;
								this.aFile6 = this.aFile5 = null;
								this.aClass118Array1 = null;
							}
						}
					} catch (@Pc(323) Exception local323) {
					}
					if (this.aClass118_2 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}
}
