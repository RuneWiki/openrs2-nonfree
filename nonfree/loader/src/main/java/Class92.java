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

@OriginalClass("loader!pc")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "loader!pc", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!pc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!pc", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!pc", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!pc", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!pc", name = "g", descriptor = "I")
	private static final int anInt3830 = 1;

	@OriginalMember(owner = "loader!pc", name = "k", descriptor = "[Lloader!qd;")
	private Class93[] aClass93Array1;

	@OriginalMember(owner = "loader!pc", name = "s", descriptor = "Lloader!uh;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!pc", name = "l", descriptor = "Lloader!dd;")
	private Class91 aClass91_3 = null;

	@OriginalMember(owner = "loader!pc", name = "b", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "Lloader!qd;")
	private Class93 aClass93_3 = null;

	@OriginalMember(owner = "loader!pc", name = "d", descriptor = "Lloader!qd;")
	private Class93 aClass93_1 = null;

	@OriginalMember(owner = "loader!pc", name = "p", descriptor = "Lloader!dd;")
	private Class91 aClass91_2 = null;

	@OriginalMember(owner = "loader!pc", name = "h", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "loader!pc", name = "r", descriptor = "Lloader!qd;")
	private Class93 aClass93_2 = null;

	@OriginalMember(owner = "loader!pc", name = "q", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!pc", name = "o", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!pc", name = "m", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!pc", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!pc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class92(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString7 = "Unknown";
		aString8 = "1.1";
		this.anApplet3 = arg1;
		try {
			aString7 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
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
		} catch (@Pc(72) Throwable local72) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(100) Exception local100) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(128) Exception local128) {
		}
		this.method2736(arg4, arg3, arg2);
		this.aBoolean174 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class91 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean174) {
						return;
					}
					if (this.aClass91_3 != null) {
						local17 = this.aClass91_3;
						this.aClass91_3 = this.aClass91_3.aClass91_1;
						if (this.aClass91_3 == null) {
							this.aClass91_2 = null;
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
				@Pc(46) int local46 = local17.anInt3825;
				if (local46 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt3827);
				} else if (local46 == 2) {
					@Pc(191) Thread local191 = new Thread((Runnable) local17.anObject6);
					local191.setDaemon(true);
					local191.start();
					local191.setPriority(local17.anInt3827);
					local17.anObject5 = local191;
				} else if (local46 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(118) Object[] local118;
					if (local46 == 8) {
						local118 = (Object[]) local17.anObject6;
						if (((Class) local118[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local118[0]).getDeclaredMethod((String) local118[1], (Class[]) local118[2]);
					} else if (local46 == 9) {
						local118 = (Object[]) local17.anObject6;
						if (((Class) local118[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local118[0]).getDeclaredField((String) local118[1]);
					} else if (local46 == 3) {
						@Pc(107) String local107 = (local17.anInt3827 >> 24 & 0xFF) + "." + (local17.anInt3827 >> 16 & 0xFF) + "." + (local17.anInt3827 >> 8 & 0xFF) + "." + (local17.anInt3827 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local107).getHostName();
					}
				}
				local17.anInt3826 = 1;
			} catch (@Pc(220) ThreadDeath local220) {
				throw local220;
			} catch (@Pc(223) Throwable local223) {
				local17.anInt3826 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method2736(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(75) int local75 = 0; local75 < local68.length; local75++) {
				for (@Pc(81) int local81 = 0; local81 < local34.length; local81++) {
					try {
						@Pc(89) String local89 = local34[local81];
						if (local89.length() > 0 && !(new File(local89)).exists()) {
							continue;
						}
						@Pc(116) File local116 = new File(local89 + local68[local75]);
						@Pc(127) boolean local127;
						if (local70 == 1 && !local116.exists()) {
							local127 = local116.mkdir();
							if (!local127) {
								continue;
							}
						}
						@Pc(139) File local139;
						if (this.aClass93_1 == null) {
							try {
								local139 = new File(local116, "random.dat");
								if (local70 == 1 || local139.exists()) {
									this.aClass93_1 = new Class93(local139, "rw", 25L);
								}
							} catch (@Pc(155) Exception local155) {
								this.aClass93_1 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(211) int local211;
							try {
								local116 = new File(local116, arg1);
								if (local70 == 1 && !local116.exists()) {
									local127 = local116.mkdir();
									if (!local127) {
										continue;
									}
								}
								local139 = new File(local116, "main_file_cache.dat2");
								if (local70 == 0 && !local139.exists()) {
									continue;
								}
								this.aClass93_2 = new Class93(local139, "rw", 52428800L);
								this.aClass93Array1 = new Class93[16];
								for (local211 = 0; local211 < 16; local211++) {
									this.aClass93Array1[local211] = new Class93(new File(local116, "main_file_cache.idx" + local211), "rw", 1048576L);
								}
								this.aClass93_3 = new Class93(new File(local116, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local116;
							} catch (@Pc(261) Exception local261) {
								try {
									this.aClass93_2.method2741();
									for (local211 = 0; local211 < 16; local211++) {
										this.aClass93Array1[local211].method2741();
									}
									this.aClass93_3.method2741();
								} catch (@Pc(288) Exception local288) {
								}
								this.aClass93_2 = this.aClass93_3 = null;
								this.aFile4 = this.aFile5 = null;
								this.aClass93Array1 = null;
							}
						}
					} catch (@Pc(305) Exception local305) {
					}
					if (this.aClass93_1 != null && this.aFile5 != null) {
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
