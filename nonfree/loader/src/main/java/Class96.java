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

@OriginalClass("loader!pf")
public final class Class96 implements Runnable {

	@OriginalMember(owner = "loader!pf", name = "a", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!pf", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!pf", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!pf", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString11;

	@OriginalMember(owner = "loader!pf", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!pf", name = "o", descriptor = "I")
	private static final int anInt4158 = 1;

	@OriginalMember(owner = "loader!pf", name = "k", descriptor = "[Lloader!mg;")
	private Class95[] aClass95Array1;

	@OriginalMember(owner = "loader!pf", name = "p", descriptor = "Lloader!kf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!pf", name = "l", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!pf", name = "e", descriptor = "Lloader!k;")
	private Class94 aClass94_2 = null;

	@OriginalMember(owner = "loader!pf", name = "j", descriptor = "Lloader!mg;")
	private Class95 aClass95_1 = null;

	@OriginalMember(owner = "loader!pf", name = "c", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!pf", name = "n", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!pf", name = "f", descriptor = "Lloader!mg;")
	private Class95 aClass95_2 = null;

	@OriginalMember(owner = "loader!pf", name = "s", descriptor = "Lloader!k;")
	private Class94 aClass94_3 = null;

	@OriginalMember(owner = "loader!pf", name = "i", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "loader!pf", name = "r", descriptor = "Lloader!mg;")
	private Class95 aClass95_3 = null;

	@OriginalMember(owner = "loader!pf", name = "m", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!pf", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!pf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class96(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString10 = "Unknown";
		aString9 = "1.1";
		try {
			aString10 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString11 = System.getProperty("user.home");
			if (aString11 != null) {
				aString11 = aString11 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString11 == null) {
			aString11 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(72) Throwable local72) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(100) Exception local100) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method3179(arg2, arg3, arg4);
		this.aBoolean179 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!pf", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3179(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString11, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(87) int local87 = 0; local87 < local78.length; local87++) {
				for (@Pc(93) int local93 = 0; local93 < local42.length; local93++) {
					try {
						@Pc(105) String local105 = local42[local93];
						if (local105.length() > 0 && !(new File(local105)).exists()) {
							continue;
						}
						@Pc(130) File local130 = new File(local105 + local78[local87]);
						@Pc(141) boolean local141;
						if (local80 == 1 && !local130.exists()) {
							local141 = local130.mkdir();
							if (!local141) {
								continue;
							}
						}
						@Pc(154) File local154;
						if (this.aClass95_3 == null) {
							try {
								local154 = new File(local130, "random.dat");
								if (local80 == 1 || local154.exists()) {
									this.aClass95_3 = new Class95(local154, "rw", 25L);
								}
							} catch (@Pc(170) Exception local170) {
								this.aClass95_3 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(226) int local226;
							try {
								local130 = new File(local130, arg1);
								if (local80 == 1 && !local130.exists()) {
									local141 = local130.mkdir();
									if (!local141) {
										continue;
									}
								}
								local154 = new File(local130, "main_file_cache.dat2");
								if (local80 == 0 && !local154.exists()) {
									continue;
								}
								this.aClass95_1 = new Class95(local154, "rw", 104857600L);
								this.aClass95Array1 = new Class95[16];
								for (local226 = 0; local226 < 16; local226++) {
									this.aClass95Array1[local226] = new Class95(new File(local130, "main_file_cache.idx" + local226), "rw", 1048576L);
								}
								this.aClass95_2 = new Class95(new File(local130, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local130;
							} catch (@Pc(272) Exception local272) {
								try {
									this.aClass95_1.method3174();
									for (local226 = 0; local226 < 16; local226++) {
										this.aClass95Array1[local226].method3174();
									}
									this.aClass95_2.method3174();
								} catch (@Pc(295) Exception local295) {
								}
								this.aClass95_1 = this.aClass95_2 = null;
								this.aFile6 = this.aFile5 = null;
								this.aClass95Array1 = null;
							}
						}
					} catch (@Pc(312) Exception local312) {
					}
					if (this.aClass95_3 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!pf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class94 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean179) {
						return;
					}
					if (this.aClass94_2 != null) {
						local16 = this.aClass94_2;
						this.aClass94_2 = this.aClass94_2.aClass94_1;
						if (this.aClass94_2 == null) {
							this.aClass94_3 = null;
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
				@Pc(46) int local46 = local16.anInt4154;
				if (local46 == 1) {
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject5), local16.anInt4153);
				} else if (local46 == 2) {
					@Pc(185) Thread local185 = new Thread((Runnable) local16.anObject5);
					local185.setDaemon(true);
					local185.start();
					local185.setPriority(local16.anInt4153);
					local16.anObject6 = local185;
				} else if (local46 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(124) Object[] local124;
					if (local46 == 8) {
						local124 = (Object[]) local16.anObject5;
						if (((Class) local124[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local124[0]).getDeclaredMethod((String) local124[1], (Class[]) local124[2]);
					} else if (local46 == 9) {
						local124 = (Object[]) local16.anObject5;
						if (((Class) local124[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local124[0]).getDeclaredField((String) local124[1]);
					} else if (local46 == 3) {
						@Pc(113) String local113 = (local16.anInt4153 >> 24 & 0xFF) + "." + (local16.anInt4153 >> 16 & 0xFF) + "." + (local16.anInt4153 >> 8 & 0xFF) + "." + (local16.anInt4153 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local113).getHostName();
					}
				}
				local16.anInt4155 = 1;
			} catch (@Pc(214) ThreadDeath local214) {
				throw local214;
			} catch (@Pc(217) Throwable local217) {
				local16.anInt4155 = 2;
			}
		}
	}
}
