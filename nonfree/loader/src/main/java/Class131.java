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

@OriginalClass("loader!ej")
public final class Class131 implements Runnable {

	@OriginalMember(owner = "loader!ej", name = "g", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ej", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ej", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "loader!ej", name = "t", descriptor = "Ljava/lang/String;")
	private static String aString17;

	@OriginalMember(owner = "loader!ej", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString18;

	@OriginalMember(owner = "loader!ej", name = "u", descriptor = "Ljava/lang/String;")
	private static String aString19;

	@OriginalMember(owner = "loader!ej", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString20;

	@OriginalMember(owner = "loader!ej", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString21;

	@OriginalMember(owner = "loader!ej", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "loader!ej", name = "l", descriptor = "I")
	private static int anInt5009 = 1;

	@OriginalMember(owner = "loader!ej", name = "d", descriptor = "[Lloader!fi;")
	private Class132[] aClass132Array1;

	@OriginalMember(owner = "loader!ej", name = "r", descriptor = "Lloader!ui;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!ej", name = "b", descriptor = "Z")
	private boolean aBoolean448 = false;

	@OriginalMember(owner = "loader!ej", name = "j", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!ej", name = "q", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!ej", name = "o", descriptor = "Lloader!ni;")
	private Class133 aClass133_1 = null;

	@OriginalMember(owner = "loader!ej", name = "m", descriptor = "Lloader!fi;")
	private Class132 aClass132_3 = null;

	@OriginalMember(owner = "loader!ej", name = "w", descriptor = "Lloader!fi;")
	private Class132 aClass132_1 = null;

	@OriginalMember(owner = "loader!ej", name = "p", descriptor = "Lloader!ni;")
	private Class133 aClass133_2 = null;

	@OriginalMember(owner = "loader!ej", name = "i", descriptor = "Lloader!fi;")
	private Class132 aClass132_2 = null;

	@OriginalMember(owner = "loader!ej", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ej", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ej", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "loader!ej", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class131(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet2 = arg1;
		aString22 = "1.1";
		aString18 = "Unknown";
		try {
			aString18 = System.getProperty("java.vendor");
			aString22 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString17 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString17 = "Unknown";
		}
		aString19 = aString17.toLowerCase();
		try {
			aString16 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString16 = "";
		}
		try {
			aString21 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString21 = "";
		}
		try {
			aString20 = System.getProperty("user.home");
			if (aString20 != null) {
				aString20 = aString20 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString20 == null) {
			aString20 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.method3768(arg4, arg2, arg3);
		this.aBoolean448 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ej", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class133 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean448) {
						return;
					}
					if (this.aClass133_1 != null) {
						local16 = this.aClass133_1;
						this.aClass133_1 = this.aClass133_1.aClass133_3;
						if (this.aClass133_1 == null) {
							this.aClass133_2 = null;
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
				@Pc(46) int local46 = local16.anInt5012;
				if (local46 == 1) {
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject7), local16.anInt5013);
				} else if (local46 == 2) {
					@Pc(61) Thread local61 = new Thread((Runnable) local16.anObject7);
					local61.setDaemon(true);
					local61.start();
					local61.setPriority(local16.anInt5013);
					local16.anObject6 = local61;
				} else if (local46 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject7).openStream());
				} else {
					@Pc(87) Object[] local87;
					if (local46 == 8) {
						local87 = (Object[]) local16.anObject7;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local87[0]).getDeclaredMethod((String) local87[1], (Class[]) local87[2]);
					} else if (local46 == 9) {
						local87 = (Object[]) local16.anObject7;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local87[0]).getDeclaredField((String) local87[1]);
					} else {
						@Pc(161) String local161;
						if (local46 == 3) {
							local161 = (local16.anInt5013 >> 24 & 0xFF) + "." + (local16.anInt5013 >> 16 & 0xFF) + "." + (local16.anInt5013 >> 8 & 0xFF) + "." + (local16.anInt5013 & 0xFF);
							local16.anObject6 = InetAddress.getByName(local161).getHostName();
						} else if (local46 == 13) {
							@Pc(185) Class[] local185 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(187) Runtime local187 = Runtime.getRuntime();
							@Pc(193) Method local193 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local185);
							local193.setAccessible(true);
							local193.invoke(local187, local16.anObject7, (new File(this.aFile4, "browsercontrol.dll")).toString());
							local193.setAccessible(false);
						} else if (local46 == 11) {
							@Pc(231) Field local231 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
							local231.setAccessible(true);
							@Pc(242) Vector local242 = (Vector) local231.get(((Class) local16.anObject7).getClassLoader());
							for (@Pc(244) int local244 = 0; local242.size() > local244; local244++) {
								@Pc(252) Object local252 = local242.elementAt(local244);
								@Pc(259) Method local259 = local252.getClass().getDeclaredMethod("finalize");
								local259.setAccessible(true);
								local259.invoke(local252);
								local259.setAccessible(false);
							}
							local231.setAccessible(false);
						} else if (local46 == 12) {
							local161 = (String) local16.anObject7;
							@Pc(295) Class132 local295 = this.method3767(local161);
							local16.anObject6 = local295;
						} else {
							throw new Exception();
						}
					}
				}
				local16.anInt5014 = 1;
			} catch (@Pc(354) ThreadDeath local354) {
				throw local354;
			} catch (@Pc(357) Throwable local357) {
				local16.anInt5014 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!ej", name = "a", descriptor = "(ILjava/lang/String;)Lloader!fi;")
	private Class132 method3767(@OriginalArg(1) String arg0) {
		@Pc(40) String[] local40 = new String[] { "c:/rscache/", "/rscache/", aString20, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
			@Pc(54) String local54 = local40[local42];
			if (local54.length() <= 0 || (new File(local54)).exists()) {
				try {
					return new Class132(new File(local54, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(87) Exception local87) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ej", name = "a", descriptor = "(IBILjava/lang/String;)V")
	private void method3768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString20, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local71.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local34.length; local90++) {
					try {
						@Pc(98) String local98 = local34[local90];
						if (local98.length() > 0 && !(new File(local98)).exists()) {
							continue;
						}
						@Pc(125) File local125 = new File(local98 + local71[local84]);
						@Pc(136) boolean local136;
						if (local79 == 1 && !local125.exists()) {
							local136 = local125.mkdir();
							if (!local136) {
								continue;
							}
						}
						@Pc(150) File local150;
						if (this.aClass132_1 == null) {
							try {
								local150 = new File(local125, "random.dat");
								if (local79 == 1 || local150.exists()) {
									this.aClass132_1 = new Class132(local150, "rw", 25L);
								}
							} catch (@Pc(166) Exception local166) {
								this.aClass132_1 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(223) int local223;
							try {
								local125 = new File(local125, arg2);
								if (local79 == 1 && !local125.exists()) {
									local136 = local125.mkdir();
									if (!local136) {
										continue;
									}
								}
								local150 = new File(local125, "main_file_cache.dat2");
								if (local79 == 0 && !local150.exists()) {
									continue;
								}
								this.aClass132_2 = new Class132(local150, "rw", 104857600L);
								this.aClass132Array1 = new Class132[27];
								for (local223 = 0; local223 < 27; local223++) {
									this.aClass132Array1[local223] = new Class132(new File(local125, "main_file_cache.idx" + local223), "rw", 1048576L);
								}
								this.aClass132_3 = new Class132(new File(local125, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local125;
							} catch (@Pc(269) Exception local269) {
								try {
									this.aClass132_2.method3775();
									for (local223 = 0; local223 < 27; local223++) {
										this.aClass132Array1[local223].method3775();
									}
									this.aClass132_3.method3775();
								} catch (@Pc(296) Exception local296) {
								}
								this.aClass132_2 = this.aClass132_3 = null;
								this.aFile4 = this.aFile5 = null;
								this.aClass132Array1 = null;
							}
						}
					} catch (@Pc(313) Exception local313) {
					}
					if (this.aClass132_1 != null && this.aFile5 != null) {
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
