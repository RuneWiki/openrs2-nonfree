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

@OriginalClass("loader!je")
public final class Class86 implements Runnable {

	@OriginalMember(owner = "loader!je", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!je", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!je", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!je", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!je", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!je", name = "l", descriptor = "I")
	private static final int anInt3177 = 1;

	@OriginalMember(owner = "loader!je", name = "o", descriptor = "[Lloader!pf;")
	private Class87[] aClass87Array1;

	@OriginalMember(owner = "loader!je", name = "e", descriptor = "Lloader!qf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!je", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!je", name = "b", descriptor = "Lloader!be;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "loader!je", name = "s", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "loader!je", name = "q", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!je", name = "p", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!je", name = "g", descriptor = "Lloader!be;")
	private Class84 aClass84_3 = null;

	@OriginalMember(owner = "loader!je", name = "m", descriptor = "Lloader!pf;")
	private Class87 aClass87_3 = null;

	@OriginalMember(owner = "loader!je", name = "i", descriptor = "Lloader!pf;")
	private Class87 aClass87_2 = null;

	@OriginalMember(owner = "loader!je", name = "d", descriptor = "Lloader!pf;")
	private Class87 aClass87_1 = null;

	@OriginalMember(owner = "loader!je", name = "n", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!je", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!je", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class86(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet2 = arg1;
		aString7 = "1.1";
		aString9 = "Unknown";
		try {
			aString9 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString8 == null) {
			aString8 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		this.method2034(arg3, arg2, arg4);
		this.aBoolean125 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!je", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method2034(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(86) int local86 = 0; local86 < local71.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local46.length; local96++) {
					try {
						@Pc(108) String local108 = local46[local96];
						if (local108.length() > 0 && !(new File(local108)).exists()) {
							continue;
						}
						@Pc(134) File local134 = new File(local108 + local71[local86]);
						@Pc(146) boolean local146;
						if (local73 == 1 && !local134.exists()) {
							local146 = local134.mkdir();
							if (!local146) {
								continue;
							}
						}
						@Pc(160) File local160;
						if (this.aClass87_3 == null) {
							try {
								local160 = new File(local134, "random.dat");
								if (local73 == 1 || local160.exists()) {
									this.aClass87_3 = new Class87(local160, "rw", 25L);
								}
							} catch (@Pc(179) Exception local179) {
								this.aClass87_3 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(235) int local235;
							try {
								local134 = new File(local134, arg0);
								if (local73 == 1 && !local134.exists()) {
									local146 = local134.mkdir();
									if (!local146) {
										continue;
									}
								}
								local160 = new File(local134, "main_file_cache.dat2");
								if (local73 == 0 && !local160.exists()) {
									continue;
								}
								this.aClass87_1 = new Class87(local160, "rw", 52428800L);
								this.aClass87Array1 = new Class87[16];
								for (local235 = 0; local235 < 16; local235++) {
									this.aClass87Array1[local235] = new Class87(new File(local134, "main_file_cache.idx" + local235), "rw", 1048576L);
								}
								this.aClass87_2 = new Class87(new File(local134, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local134;
							} catch (@Pc(281) Exception local281) {
								try {
									this.aClass87_1.method2053();
									for (local235 = 0; local235 < 16; local235++) {
										this.aClass87Array1[local235].method2053();
									}
									this.aClass87_2.method2053();
								} catch (@Pc(304) Exception local304) {
								}
								this.aClass87Array1 = null;
								this.aFile4 = this.aFile5 = null;
								this.aClass87_1 = this.aClass87_2 = null;
							}
						}
					} catch (@Pc(321) Exception local321) {
					}
					if (this.aClass87_3 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class84 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean125) {
						return;
					}
					if (this.aClass84_3 != null) {
						local18 = this.aClass84_3;
						this.aClass84_3 = this.aClass84_3.aClass84_1;
						if (this.aClass84_3 == null) {
							this.aClass84_2 = null;
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
				@Pc(47) int local47 = local18.anInt3176;
				if (local47 == 1) {
					local18.anObject5 = new Socket(InetAddress.getByName((String) local18.anObject6), local18.anInt3174);
				} else if (local47 == 2) {
					@Pc(193) Thread local193 = new Thread((Runnable) local18.anObject6);
					local193.setDaemon(true);
					local193.start();
					local193.setPriority(local18.anInt3174);
					local18.anObject5 = local193;
				} else if (local47 == 4) {
					local18.anObject5 = new DataInputStream(((URL) local18.anObject6).openStream());
				} else {
					@Pc(80) Object[] local80;
					if (local47 == 8) {
						local80 = (Object[]) local18.anObject6;
						if (((Class) local80[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject5 = ((Class) local80[0]).getDeclaredMethod((String) local80[1], (Class[]) local80[2]);
					} else if (local47 == 9) {
						local80 = (Object[]) local18.anObject6;
						if (((Class) local80[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject5 = ((Class) local80[0]).getDeclaredField((String) local80[1]);
					} else if (local47 == 3) {
						@Pc(153) String local153 = (local18.anInt3174 >> 24 & 0xFF) + "." + (local18.anInt3174 >> 16 & 0xFF) + "." + (local18.anInt3174 >> 8 & 0xFF) + "." + (local18.anInt3174 & 0xFF);
						local18.anObject5 = InetAddress.getByName(local153).getHostName();
					}
				}
				local18.anInt3175 = 1;
			} catch (@Pc(222) ThreadDeath local222) {
				throw local222;
			} catch (@Pc(225) Throwable local225) {
				local18.anInt3175 = 2;
			}
		}
	}
}
