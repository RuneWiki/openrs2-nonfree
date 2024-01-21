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

@OriginalClass("loader!ih")
public final class Class93 implements Runnable {

	@OriginalMember(owner = "loader!ih", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!ih", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ih", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!ih", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!ih", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "I")
	private static final int anInt3982 = 1;

	@OriginalMember(owner = "loader!ih", name = "p", descriptor = "Lloader!rb;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ih", name = "f", descriptor = "[Lloader!dg;")
	private Class91[] aClass91Array1;

	@OriginalMember(owner = "loader!ih", name = "j", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ih", name = "g", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "loader!ih", name = "n", descriptor = "Lloader!ha;")
	private Class92 aClass92_3 = null;

	@OriginalMember(owner = "loader!ih", name = "o", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!ih", name = "h", descriptor = "Lloader!ha;")
	private Class92 aClass92_2 = null;

	@OriginalMember(owner = "loader!ih", name = "k", descriptor = "Lloader!dg;")
	private Class91 aClass91_3 = null;

	@OriginalMember(owner = "loader!ih", name = "r", descriptor = "Lloader!dg;")
	private Class91 aClass91_2 = null;

	@OriginalMember(owner = "loader!ih", name = "d", descriptor = "Lloader!dg;")
	private Class91 aClass91_1 = null;

	@OriginalMember(owner = "loader!ih", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ih", name = "b", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ih", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ih", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class93(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString7 = "1.1";
		aString8 = "Unknown";
		this.anApplet2 = arg1;
		try {
			aString8 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(71) Throwable local71) {
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
		this.method2820(arg4, arg2, arg3);
		this.aBoolean274 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ih", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class92 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean274) {
						return;
					}
					if (this.aClass92_3 != null) {
						local17 = this.aClass92_3;
						this.aClass92_3 = this.aClass92_3.aClass92_1;
						if (this.aClass92_3 == null) {
							this.aClass92_2 = null;
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
				@Pc(46) int local46 = local17.anInt3980;
				if (local46 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt3981);
				} else if (local46 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local17.anObject6);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local17.anInt3981);
					local17.anObject5 = local59;
				} else if (local46 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(95) Object[] local95;
					if (local46 == 8) {
						local95 = (Object[]) local17.anObject6;
						if (((Class) local95[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local95[0]).getDeclaredMethod((String) local95[1], (Class[]) local95[2]);
					} else if (local46 == 9) {
						local95 = (Object[]) local17.anObject6;
						if (((Class) local95[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local95[0]).getDeclaredField((String) local95[1]);
					} else if (local46 == 3) {
						@Pc(166) String local166 = (local17.anInt3981 >> 24 & 0xFF) + "." + (local17.anInt3981 >> 16 & 0xFF) + "." + (local17.anInt3981 >> 8 & 0xFF) + "." + (local17.anInt3981 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local166).getHostName();
					}
				}
				local17.anInt3979 = 1;
			} catch (@Pc(217) ThreadDeath local217) {
				throw local217;
			} catch (@Pc(220) Throwable local220) {
				local17.anInt3979 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method2820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(85) int local85 = 0; local85 < local70.length; local85++) {
				for (@Pc(95) int local95 = 0; local95 < local45.length; local95++) {
					try {
						@Pc(107) String local107 = local45[local95];
						if (local107.length() > 0 && !(new File(local107)).exists()) {
							continue;
						}
						@Pc(132) File local132 = new File(local107 + local70[local85]);
						@Pc(144) boolean local144;
						if (local78 == 1 && !local132.exists()) {
							local144 = local132.mkdir();
							if (!local144) {
								continue;
							}
						}
						@Pc(159) File local159;
						if (this.aClass91_2 == null) {
							try {
								local159 = new File(local132, "random.dat");
								if (local78 == 1 || local159.exists()) {
									this.aClass91_2 = new Class91(local159, "rw", 25L);
								}
							} catch (@Pc(176) Exception local176) {
								this.aClass91_2 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(232) int local232;
							try {
								local132 = new File(local132, arg2);
								if (local78 == 1 && !local132.exists()) {
									local144 = local132.mkdir();
									if (!local144) {
										continue;
									}
								}
								local159 = new File(local132, "main_file_cache.dat2");
								if (local78 == 0 && !local159.exists()) {
									continue;
								}
								this.aClass91_1 = new Class91(local159, "rw", 104857600L);
								this.aClass91Array1 = new Class91[16];
								for (local232 = 0; local232 < 16; local232++) {
									this.aClass91Array1[local232] = new Class91(new File(local132, "main_file_cache.idx" + local232), "rw", 1048576L);
								}
								this.aClass91_3 = new Class91(new File(local132, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local132;
							} catch (@Pc(278) Exception local278) {
								try {
									this.aClass91_1.method2809();
									for (local232 = 0; local232 < 16; local232++) {
										this.aClass91Array1[local232].method2809();
									}
									this.aClass91_3.method2809();
								} catch (@Pc(301) Exception local301) {
								}
								this.aClass91Array1 = null;
								this.aFile5 = this.aFile6 = null;
								this.aClass91_1 = this.aClass91_3 = null;
							}
						}
					} catch (@Pc(318) Exception local318) {
					}
					if (this.aClass91_2 != null && this.aFile6 != null) {
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
