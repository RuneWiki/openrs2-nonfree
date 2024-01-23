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

@OriginalClass("loader!mc")
public final class Class111 implements Runnable {

	@OriginalMember(owner = "loader!mc", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!mc", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!mc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!mc", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!mc", name = "g", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!mc", name = "o", descriptor = "I")
	private static int anInt4752 = 1;

	@OriginalMember(owner = "loader!mc", name = "j", descriptor = "[Lloader!kg;")
	private Class110[] aClass110Array1;

	@OriginalMember(owner = "loader!mc", name = "s", descriptor = "Lloader!p;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!mc", name = "r", descriptor = "Lloader!fi;")
	private Class109 aClass109_2 = null;

	@OriginalMember(owner = "loader!mc", name = "h", descriptor = "Z")
	private boolean aBoolean272 = false;

	@OriginalMember(owner = "loader!mc", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!mc", name = "i", descriptor = "Lloader!kg;")
	private Class110 aClass110_2 = null;

	@OriginalMember(owner = "loader!mc", name = "n", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!mc", name = "d", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!mc", name = "b", descriptor = "Lloader!kg;")
	private Class110 aClass110_3 = null;

	@OriginalMember(owner = "loader!mc", name = "f", descriptor = "Lloader!kg;")
	private Class110 aClass110_1 = null;

	@OriginalMember(owner = "loader!mc", name = "p", descriptor = "Lloader!fi;")
	private Class109 aClass109_3 = null;

	@OriginalMember(owner = "loader!mc", name = "k", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!mc", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "loader!mc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class111(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString10 = "1.1";
		aString8 = "Unknown";
		try {
			aString8 = System.getProperty("java.vendor");
			aString10 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(61) Exception local61) {
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
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		this.method3553(arg2, arg4, arg3);
		this.aBoolean272 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!mc", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(37) String[] local37 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(72) String[] local72 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local37.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local72.length; local91++) {
					try {
						@Pc(103) String local103 = local72[local91];
						if (local103.length() > 0 && !(new File(local103)).exists()) {
							continue;
						}
						@Pc(130) File local130 = new File(local103 + local37[local85]);
						@Pc(140) boolean local140;
						if (local80 == 1 && !local130.exists()) {
							local140 = local130.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(153) File local153;
						if (this.aClass110_3 == null) {
							try {
								local153 = new File(local130, "random.dat");
								if (local80 == 1 || local153.exists()) {
									this.aClass110_3 = new Class110(local153, "rw", 25L);
								}
							} catch (@Pc(172) Exception local172) {
								this.aClass110_3 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(229) int local229;
							try {
								local130 = new File(local130, arg2);
								if (local80 == 1 && !local130.exists()) {
									local140 = local130.mkdir();
									if (!local140) {
										continue;
									}
								}
								local153 = new File(local130, "main_file_cache.dat2");
								if (local80 == 0 && !local153.exists()) {
									continue;
								}
								this.aClass110_1 = new Class110(local153, "rw", 104857600L);
								this.aClass110Array1 = new Class110[27];
								for (local229 = 0; local229 < 27; local229++) {
									this.aClass110Array1[local229] = new Class110(new File(local130, "main_file_cache.idx" + local229), "rw", 1048576L);
								}
								this.aClass110_2 = new Class110(new File(local130, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local130;
							} catch (@Pc(279) Exception local279) {
								try {
									this.aClass110_1.method3543();
									for (local229 = 0; local229 < 27; local229++) {
										this.aClass110Array1[local229].method3543();
									}
									this.aClass110_2.method3543();
								} catch (@Pc(306) Exception local306) {
								}
								this.aClass110Array1 = null;
								this.aClass110_1 = this.aClass110_2 = null;
								this.aFile5 = this.aFile6 = null;
							}
						}
					} catch (@Pc(323) Exception local323) {
					}
					if (this.aClass110_3 != null && this.aFile6 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile6 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!mc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class109 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean272) {
						return;
					}
					if (this.aClass109_3 != null) {
						local17 = this.aClass109_3;
						this.aClass109_3 = this.aClass109_3.aClass109_1;
						if (this.aClass109_3 == null) {
							this.aClass109_2 = null;
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
				@Pc(47) int local47 = local17.anInt4748;
				if (local47 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt4747);
				} else if (local47 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local17.anObject5);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local17.anInt4747);
					local17.anObject6 = local60;
				} else if (local47 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(84) Object[] local84;
					if (local47 == 8) {
						local84 = (Object[]) local17.anObject5;
						if (((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local84[0]).getDeclaredMethod((String) local84[1], (Class[]) local84[2]);
					} else if (local47 == 9) {
						local84 = (Object[]) local17.anObject5;
						if (((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local84[0]).getDeclaredField((String) local84[1]);
					} else if (local47 == 3) {
						@Pc(159) String local159 = (local17.anInt4747 >> 24 & 0xFF) + "." + (local17.anInt4747 >> 16 & 0xFF) + "." + (local17.anInt4747 >> 8 & 0xFF) + "." + (local17.anInt4747 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local159).getHostName();
					} else {
						throw new Exception();
					}
				}
				local17.anInt4749 = 1;
			} catch (@Pc(219) ThreadDeath local219) {
				throw local219;
			} catch (@Pc(222) Throwable local222) {
				local17.anInt4749 = 2;
			}
		}
	}
}
