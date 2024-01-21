import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class107 implements Runnable {

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!a", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!a", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!a", name = "h", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!a", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!a", name = "n", descriptor = "I")
	private static final int anInt4308 = 1;

	@OriginalMember(owner = "loader!a", name = "i", descriptor = "[Lloader!pg;")
	private Class110[] aClass110Array1;

	@OriginalMember(owner = "loader!a", name = "r", descriptor = "Lloader!ea;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Lloader!cd;")
	private Class109 aClass109_1 = null;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "loader!a", name = "k", descriptor = "Lloader!pg;")
	private Class110 aClass110_1 = null;

	@OriginalMember(owner = "loader!a", name = "p", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!a", name = "j", descriptor = "Lloader!pg;")
	private Class110 aClass110_2 = null;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "Lloader!pg;")
	private Class110 aClass110_3 = null;

	@OriginalMember(owner = "loader!a", name = "s", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!a", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "Lloader!cd;")
	private Class109 aClass109_2 = null;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!a", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class107(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet2 = arg1;
		aString8 = "Unknown";
		aString9 = "1.1";
		try {
			aString8 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString7 = System.getProperty("user.home");
			if (aString7 != null) {
				aString7 = aString7 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString7 == null) {
			aString7 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method3276(arg3, arg4, arg2);
		this.aBoolean197 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class109 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean197) {
						return;
					}
					if (this.aClass109_1 != null) {
						local16 = this.aClass109_1;
						this.aClass109_1 = this.aClass109_1.aClass109_3;
						if (this.aClass109_1 == null) {
							this.aClass109_2 = null;
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
				@Pc(45) int local45 = local16.anInt4310;
				if (local45 == 1) {
					local16.anObject5 = new Socket(InetAddress.getByName((String) local16.anObject6), local16.anInt4312);
				} else if (local45 == 2) {
					@Pc(72) Thread local72 = new Thread((Runnable) local16.anObject6);
					local72.setDaemon(true);
					local72.start();
					local72.setPriority(local16.anInt4312);
					local16.anObject5 = local72;
				} else if (local45 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(106) Object[] local106;
					if (local45 == 8) {
						local106 = (Object[]) local16.anObject6;
						if (((Class) local106[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local106[0]).getDeclaredMethod((String) local106[1], (Class[]) local106[2]);
					} else if (local45 == 9) {
						local106 = (Object[]) local16.anObject6;
						if (((Class) local106[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local106[0]).getDeclaredField((String) local106[1]);
					} else if (local45 == 3) {
						@Pc(182) String local182 = (local16.anInt4312 >> 24 & 0xFF) + "." + (local16.anInt4312 >> 16 & 0xFF) + "." + (local16.anInt4312 >> 8 & 0xFF) + "." + (local16.anInt4312 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local182).getHostName();
					} else {
						throw new Exception();
					}
				}
				local16.anInt4311 = 1;
			} catch (@Pc(220) ThreadDeath local220) {
				throw local220;
			} catch (@Pc(223) Throwable local223) {
				local16.anInt4311 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3276(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(86) int local86 = 0; local86 < local71.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local34.length; local92++) {
					try {
						@Pc(100) String local100 = local34[local92];
						if (local100.length() > 0 && !(new File(local100)).exists()) {
							continue;
						}
						@Pc(126) File local126 = new File(local100 + local71[local86]);
						@Pc(138) boolean local138;
						if (local73 == 1 && !local126.exists()) {
							local138 = local126.mkdir();
							if (!local138) {
								continue;
							}
						}
						@Pc(151) File local151;
						if (this.aClass110_3 == null) {
							try {
								local151 = new File(local126, "random.dat");
								if (local73 == 1 || local151.exists()) {
									this.aClass110_3 = new Class110(local151, "rw", 25L);
								}
							} catch (@Pc(167) Exception local167) {
								this.aClass110_3 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(224) int local224;
							try {
								local126 = new File(local126, arg0);
								if (local73 == 1 && !local126.exists()) {
									local138 = local126.mkdir();
									if (!local138) {
										continue;
									}
								}
								local151 = new File(local126, "main_file_cache.dat2");
								if (local73 == 0 && !local151.exists()) {
									continue;
								}
								this.aClass110_1 = new Class110(local151, "rw", 104857600L);
								this.aClass110Array1 = new Class110[24];
								for (local224 = 0; local224 < 24; local224++) {
									this.aClass110Array1[local224] = new Class110(new File(local126, "main_file_cache.idx" + local224), "rw", 1048576L);
								}
								this.aClass110_2 = new Class110(new File(local126, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local126;
							} catch (@Pc(270) Exception local270) {
								try {
									this.aClass110_1.method3306();
									for (local224 = 0; local224 < 24; local224++) {
										this.aClass110Array1[local224].method3306();
									}
									this.aClass110_2.method3306();
								} catch (@Pc(297) Exception local297) {
								}
								this.aFile4 = this.aFile5 = null;
								this.aClass110_1 = this.aClass110_2 = null;
								this.aClass110Array1 = null;
							}
						}
					} catch (@Pc(314) Exception local314) {
					}
					if (this.aClass110_3 != null && this.aFile5 != null) {
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
