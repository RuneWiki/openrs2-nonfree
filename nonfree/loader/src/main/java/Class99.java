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

@OriginalClass("loader!t")
public final class Class99 implements Runnable {

	@OriginalMember(owner = "loader!t", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!t", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!t", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!t", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!t", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!t", name = "o", descriptor = "I")
	private static final int anInt4674 = 1;

	@OriginalMember(owner = "loader!t", name = "b", descriptor = "[Lloader!gd;")
	private Class98[] aClass98Array1;

	@OriginalMember(owner = "loader!t", name = "f", descriptor = "Lloader!uf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!t", name = "c", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!t", name = "l", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!t", name = "i", descriptor = "Lloader!gd;")
	private Class98 aClass98_2 = null;

	@OriginalMember(owner = "loader!t", name = "j", descriptor = "Lloader!gd;")
	private Class98 aClass98_1 = null;

	@OriginalMember(owner = "loader!t", name = "g", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "loader!t", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!t", name = "h", descriptor = "Lloader!fd;")
	private Class97 aClass97_3 = null;

	@OriginalMember(owner = "loader!t", name = "e", descriptor = "Lloader!fd;")
	private Class97 aClass97_2 = null;

	@OriginalMember(owner = "loader!t", name = "q", descriptor = "Lloader!gd;")
	private Class98 aClass98_3 = null;

	@OriginalMember(owner = "loader!t", name = "s", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!t", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!t", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class99(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "1.1";
		aString9 = "Unknown";
		this.anApplet3 = arg1;
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
		} catch (@Pc(61) Exception local61) {
		}
		if (aString7 == null) {
			aString7 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(71) Throwable local71) {
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
		} catch (@Pc(125) Exception local125) {
		}
		this.method3603(arg3, arg2, arg4);
		this.aBoolean189 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!t", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method3603(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(76) int local76 = 0; local76 < local69.length; local76++) {
				for (@Pc(82) int local82 = 0; local82 < local34.length; local82++) {
					try {
						@Pc(90) String local90 = local34[local82];
						if (local90.length() > 0 && !(new File(local90)).exists()) {
							continue;
						}
						@Pc(118) File local118 = new File(local90 + local69[local76]);
						@Pc(127) boolean local127;
						if (local71 == 1 && !local118.exists()) {
							local127 = local118.mkdir();
							if (!local127) {
								continue;
							}
						}
						@Pc(142) File local142;
						if (this.aClass98_2 == null) {
							try {
								local142 = new File(local118, "random.dat");
								if (local71 == 1 || local142.exists()) {
									this.aClass98_2 = new Class98(local142, "rw", 25L);
								}
							} catch (@Pc(158) Exception local158) {
								this.aClass98_2 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(212) int local212;
							try {
								local118 = new File(local118, arg0);
								if (local71 == 1 && !local118.exists()) {
									local127 = local118.mkdir();
									if (!local127) {
										continue;
									}
								}
								local142 = new File(local118, "main_file_cache.dat2");
								if (local71 == 0 && !local142.exists()) {
									continue;
								}
								this.aClass98_1 = new Class98(local142, "rw", 104857600L);
								this.aClass98Array1 = new Class98[23];
								for (local212 = 0; local212 < 23; local212++) {
									this.aClass98Array1[local212] = new Class98(new File(local118, "main_file_cache.idx" + local212), "rw", 1048576L);
								}
								this.aClass98_3 = new Class98(new File(local118, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local118;
							} catch (@Pc(262) Exception local262) {
								try {
									this.aClass98_1.method3590();
									for (local212 = 0; local212 < 23; local212++) {
										this.aClass98Array1[local212].method3590();
									}
									this.aClass98_3.method3590();
								} catch (@Pc(289) Exception local289) {
								}
								this.aClass98Array1 = null;
								this.aFile6 = this.aFile5 = null;
								this.aClass98_1 = this.aClass98_3 = null;
							}
						}
					} catch (@Pc(306) Exception local306) {
					}
					if (this.aClass98_2 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!t", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class97 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean189) {
						return;
					}
					if (this.aClass97_2 != null) {
						local15 = this.aClass97_2;
						this.aClass97_2 = this.aClass97_2.aClass97_1;
						if (this.aClass97_2 == null) {
							this.aClass97_3 = null;
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
				@Pc(44) int local44 = local15.anInt4670;
				if (local44 == 1) {
					local15.anObject6 = new Socket(InetAddress.getByName((String) local15.anObject5), local15.anInt4669);
				} else if (local44 == 2) {
					@Pc(200) Thread local200 = new Thread((Runnable) local15.anObject5);
					local200.setDaemon(true);
					local200.start();
					local200.setPriority(local15.anInt4669);
					local15.anObject6 = local200;
				} else if (local44 == 4) {
					local15.anObject6 = new DataInputStream(((URL) local15.anObject5).openStream());
				} else {
					@Pc(85) Object[] local85;
					if (local44 == 8) {
						local85 = (Object[]) local15.anObject5;
						if (((Class) local85[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject6 = ((Class) local85[0]).getDeclaredMethod((String) local85[1], (Class[]) local85[2]);
					} else if (local44 == 9) {
						local85 = (Object[]) local15.anObject5;
						if (((Class) local85[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject6 = ((Class) local85[0]).getDeclaredField((String) local85[1]);
					} else if (local44 == 3) {
						@Pc(158) String local158 = (local15.anInt4669 >> 24 & 0xFF) + "." + (local15.anInt4669 >> 16 & 0xFF) + "." + (local15.anInt4669 >> 8 & 0xFF) + "." + (local15.anInt4669 & 0xFF);
						local15.anObject6 = InetAddress.getByName(local158).getHostName();
					}
				}
				local15.anInt4671 = 1;
			} catch (@Pc(217) ThreadDeath local217) {
				throw local217;
			} catch (@Pc(220) Throwable local220) {
				local15.anInt4671 = 2;
			}
		}
	}
}
