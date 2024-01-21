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

@OriginalClass("loader!na")
public final class Class96 implements Runnable {

	@OriginalMember(owner = "loader!na", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!na", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!na", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!na", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!na", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!na", name = "g", descriptor = "I")
	private static final int anInt4516 = 1;

	@OriginalMember(owner = "loader!na", name = "a", descriptor = "[Lloader!nh;")
	private Class97[] aClass97Array1;

	@OriginalMember(owner = "loader!na", name = "q", descriptor = "Lloader!tc;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!na", name = "k", descriptor = "Lloader!wg;")
	private Class98 aClass98_1 = null;

	@OriginalMember(owner = "loader!na", name = "m", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!na", name = "h", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "loader!na", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!na", name = "d", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!na", name = "j", descriptor = "Lloader!nh;")
	private Class97 aClass97_2 = null;

	@OriginalMember(owner = "loader!na", name = "n", descriptor = "Lloader!wg;")
	private Class98 aClass98_2 = null;

	@OriginalMember(owner = "loader!na", name = "e", descriptor = "Lloader!nh;")
	private Class97 aClass97_3 = null;

	@OriginalMember(owner = "loader!na", name = "p", descriptor = "Lloader!nh;")
	private Class97 aClass97_1 = null;

	@OriginalMember(owner = "loader!na", name = "o", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!na", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!na", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class96(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString9 = "Unknown";
		aString8 = "1.1";
		try {
			aString9 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
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
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		this.method3193(arg2, arg4, arg3);
		this.aBoolean185 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!na", name = "a", descriptor = "(IBILjava/lang/String;)V")
	private void method3193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(75) int local75 = 0; local75 < local68.length; local75++) {
				for (@Pc(81) int local81 = 0; local81 < local34.length; local81++) {
					try {
						@Pc(89) String local89 = local34[local81];
						if (local89.length() > 0 && !(new File(local89)).exists()) {
							continue;
						}
						@Pc(117) File local117 = new File(local89 + local68[local75]);
						@Pc(129) boolean local129;
						if (local70 == 1 && !local117.exists()) {
							local129 = local117.mkdir();
							if (!local129) {
								continue;
							}
						}
						@Pc(142) File local142;
						if (this.aClass97_1 == null) {
							try {
								local142 = new File(local117, "random.dat");
								if (local70 == 1 || local142.exists()) {
									this.aClass97_1 = new Class97(local142, "rw", 25L);
								}
							} catch (@Pc(159) Exception local159) {
								this.aClass97_1 = null;
							}
						}
						if (this.aFile4 == null) {
							@Pc(215) int local215;
							try {
								local117 = new File(local117, arg2);
								if (local70 == 1 && !local117.exists()) {
									local129 = local117.mkdir();
									if (!local129) {
										continue;
									}
								}
								local142 = new File(local117, "main_file_cache.dat2");
								if (local70 == 0 && !local142.exists()) {
									continue;
								}
								this.aClass97_2 = new Class97(local142, "rw", 104857600L);
								this.aClass97Array1 = new Class97[23];
								for (local215 = 0; local215 < 23; local215++) {
									this.aClass97Array1[local215] = new Class97(new File(local117, "main_file_cache.idx" + local215), "rw", 1048576L);
								}
								this.aClass97_3 = new Class97(new File(local117, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local117;
							} catch (@Pc(265) Exception local265) {
								try {
									this.aClass97_2.method3207();
									for (local215 = 0; local215 < 23; local215++) {
										this.aClass97Array1[local215].method3207();
									}
									this.aClass97_3.method3207();
								} catch (@Pc(288) Exception local288) {
								}
								this.aClass97Array1 = null;
								this.aFile5 = this.aFile4 = null;
								this.aClass97_2 = this.aClass97_3 = null;
							}
						}
					} catch (@Pc(305) Exception local305) {
					}
					if (this.aClass97_1 != null && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!na", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class98 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean185) {
						return;
					}
					if (this.aClass98_1 != null) {
						local17 = this.aClass98_1;
						this.aClass98_1 = this.aClass98_1.aClass98_3;
						if (this.aClass98_1 == null) {
							this.aClass98_2 = null;
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
				@Pc(46) int local46 = local17.anInt4517;
				if (local46 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt4519);
				} else if (local46 == 2) {
					@Pc(71) Thread local71 = new Thread((Runnable) local17.anObject5);
					local71.setDaemon(true);
					local71.start();
					local71.setPriority(local17.anInt4519);
					local17.anObject6 = local71;
				} else if (local46 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(105) Object[] local105;
					if (local46 == 8) {
						local105 = (Object[]) local17.anObject5;
						if (((Class) local105[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local105[0]).getDeclaredMethod((String) local105[1], (Class[]) local105[2]);
					} else if (local46 == 9) {
						local105 = (Object[]) local17.anObject5;
						if (((Class) local105[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local105[0]).getDeclaredField((String) local105[1]);
					} else if (local46 == 3) {
						@Pc(177) String local177 = (local17.anInt4519 >> 24 & 0xFF) + "." + (local17.anInt4519 >> 16 & 0xFF) + "." + (local17.anInt4519 >> 8 & 0xFF) + "." + (local17.anInt4519 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local177).getHostName();
					}
				}
				local17.anInt4518 = 1;
			} catch (@Pc(214) ThreadDeath local214) {
				throw local214;
			} catch (@Pc(217) Throwable local217) {
				local17.anInt4518 = 2;
			}
		}
	}
}
