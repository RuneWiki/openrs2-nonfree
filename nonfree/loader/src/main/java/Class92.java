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

@OriginalClass("loader!qe")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "loader!qe", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!qe", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!qe", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!qe", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!qe", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!qe", name = "q", descriptor = "I")
	private static final int anInt4085 = 1;

	@OriginalMember(owner = "loader!qe", name = "l", descriptor = "[Lloader!vh;")
	private Class93[] aClass93Array1;

	@OriginalMember(owner = "loader!qe", name = "g", descriptor = "Lloader!wf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!qe", name = "b", descriptor = "Lloader!je;")
	private Class91 aClass91_3 = null;

	@OriginalMember(owner = "loader!qe", name = "h", descriptor = "Lloader!vh;")
	private Class93 aClass93_1 = null;

	@OriginalMember(owner = "loader!qe", name = "a", descriptor = "Lloader!je;")
	private Class91 aClass91_2 = null;

	@OriginalMember(owner = "loader!qe", name = "s", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "loader!qe", name = "o", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!qe", name = "m", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!qe", name = "j", descriptor = "Lloader!vh;")
	private Class93 aClass93_2 = null;

	@OriginalMember(owner = "loader!qe", name = "n", descriptor = "Lloader!vh;")
	private Class93 aClass93_3 = null;

	@OriginalMember(owner = "loader!qe", name = "p", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!qe", name = "i", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!qe", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!qe", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class92(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString9 = "1.1";
		aString8 = "Unknown";
		this.anApplet3 = arg1;
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
		} catch (@Pc(60) Exception local60) {
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
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		this.method2924(arg2, arg4, arg3);
		this.aBoolean179 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!qe", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method2924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(78) int local78 = 0; local78 < local69.length; local78++) {
				for (@Pc(84) int local84 = 0; local84 < local34.length; local84++) {
					try {
						@Pc(96) String local96 = local34[local84];
						if (local96.length() > 0 && !(new File(local96)).exists()) {
							continue;
						}
						@Pc(123) File local123 = new File(local96 + local69[local78]);
						@Pc(132) boolean local132;
						if (local71 == 1 && !local123.exists()) {
							local132 = local123.mkdir();
							if (!local132) {
								continue;
							}
						}
						@Pc(147) File local147;
						if (this.aClass93_3 == null) {
							try {
								local147 = new File(local123, "random.dat");
								if (local71 == 1 || local147.exists()) {
									this.aClass93_3 = new Class93(local147, "rw", 25L);
								}
							} catch (@Pc(165) Exception local165) {
								this.aClass93_3 = null;
							}
						}
						if (this.aFile4 == null) {
							@Pc(220) int local220;
							try {
								local123 = new File(local123, arg2);
								if (local71 == 1 && !local123.exists()) {
									local132 = local123.mkdir();
									if (!local132) {
										continue;
									}
								}
								local147 = new File(local123, "main_file_cache.dat2");
								if (local71 == 0 && !local147.exists()) {
									continue;
								}
								this.aClass93_1 = new Class93(local147, "rw", 104857600L);
								this.aClass93Array1 = new Class93[16];
								for (local220 = 0; local220 < 16; local220++) {
									this.aClass93Array1[local220] = new Class93(new File(local123, "main_file_cache.idx" + local220), "rw", 1048576L);
								}
								this.aClass93_2 = new Class93(new File(local123, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local123;
							} catch (@Pc(270) Exception local270) {
								try {
									this.aClass93_1.method2932();
									for (local220 = 0; local220 < 16; local220++) {
										this.aClass93Array1[local220].method2932();
									}
									this.aClass93_2.method2932();
								} catch (@Pc(299) Exception local299) {
								}
								this.aFile5 = this.aFile4 = null;
								this.aClass93Array1 = null;
								this.aClass93_1 = this.aClass93_2 = null;
							}
						}
					} catch (@Pc(316) Exception local316) {
					}
					if (this.aClass93_3 != null && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!qe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class91 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean179) {
						return;
					}
					if (this.aClass91_3 != null) {
						local16 = this.aClass91_3;
						this.aClass91_3 = this.aClass91_3.aClass91_1;
						if (this.aClass91_3 == null) {
							this.aClass91_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local16.anInt4082;
				if (local44 == 1) {
					local16.anObject5 = new Socket(InetAddress.getByName((String) local16.anObject6), local16.anInt4081);
				} else if (local44 == 2) {
					@Pc(193) Thread local193 = new Thread((Runnable) local16.anObject6);
					local193.setDaemon(true);
					local193.start();
					local193.setPriority(local16.anInt4081);
					local16.anObject5 = local193;
				} else if (local44 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(82) Object[] local82;
					if (local44 == 8) {
						local82 = (Object[]) local16.anObject6;
						if (((Class) local82[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local82[0]).getDeclaredMethod((String) local82[1], (Class[]) local82[2]);
					} else if (local44 == 9) {
						local82 = (Object[]) local16.anObject6;
						if (((Class) local82[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local82[0]).getDeclaredField((String) local82[1]);
					} else if (local44 == 3) {
						@Pc(146) String local146 = (local16.anInt4081 >> 24 & 0xFF) + "." + (local16.anInt4081 >> 16 & 0xFF) + "." + (local16.anInt4081 >> 8 & 0xFF) + "." + (local16.anInt4081 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local146).getHostName();
					}
				}
				local16.anInt4080 = 1;
			} catch (@Pc(222) ThreadDeath local222) {
				throw local222;
			} catch (@Pc(225) Throwable local225) {
				local16.anInt4080 = 2;
			}
		}
	}
}
