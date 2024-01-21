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

@OriginalClass("loader!qd")
public final class Class94 implements Runnable {

	@OriginalMember(owner = "loader!qd", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!qd", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!qd", name = "d", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!qd", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!qd", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!qd", name = "q", descriptor = "I")
	private static final int anInt4031 = 1;

	@OriginalMember(owner = "loader!qd", name = "e", descriptor = "[Lloader!ec;")
	private Class93[] aClass93Array1;

	@OriginalMember(owner = "loader!qd", name = "k", descriptor = "Lloader!da;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!qd", name = "f", descriptor = "Lloader!ec;")
	private Class93 aClass93_1 = null;

	@OriginalMember(owner = "loader!qd", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!qd", name = "s", descriptor = "Lloader!ca;")
	private Class92 aClass92_2 = null;

	@OriginalMember(owner = "loader!qd", name = "n", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!qd", name = "b", descriptor = "Lloader!ca;")
	private Class92 aClass92_3 = null;

	@OriginalMember(owner = "loader!qd", name = "a", descriptor = "Lloader!ec;")
	private Class93 aClass93_2 = null;

	@OriginalMember(owner = "loader!qd", name = "o", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!qd", name = "l", descriptor = "Lloader!ec;")
	private Class93 aClass93_3 = null;

	@OriginalMember(owner = "loader!qd", name = "p", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "loader!qd", name = "i", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!qd", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!qd", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class94(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString9 = "1.1";
		this.anApplet3 = arg1;
		aString7 = "Unknown";
		try {
			aString7 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
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
		this.method2951(arg4, arg3, arg2);
		this.aBoolean177 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!qd", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method2951(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(80) int local80 = 0; local80 < local71.length; local80++) {
				for (@Pc(86) int local86 = 0; local86 < local46.length; local86++) {
					try {
						@Pc(94) String local94 = local46[local86];
						if (local94.length() > 0 && !(new File(local94)).exists()) {
							continue;
						}
						@Pc(121) File local121 = new File(local94 + local71[local80]);
						@Pc(132) boolean local132;
						if (local73 == 1 && !local121.exists()) {
							local132 = local121.mkdir();
							if (!local132) {
								continue;
							}
						}
						@Pc(146) File local146;
						if (this.aClass93_1 == null) {
							try {
								local146 = new File(local121, "random.dat");
								if (local73 == 1 || local146.exists()) {
									this.aClass93_1 = new Class93(local146, "rw", 25L);
								}
							} catch (@Pc(163) Exception local163) {
								this.aClass93_1 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(221) int local221;
							try {
								local121 = new File(local121, arg1);
								if (local73 == 1 && !local121.exists()) {
									local132 = local121.mkdir();
									if (!local132) {
										continue;
									}
								}
								local146 = new File(local121, "main_file_cache.dat2");
								if (local73 == 0 && !local146.exists()) {
									continue;
								}
								this.aClass93_3 = new Class93(local146, "rw", 104857600L);
								this.aClass93Array1 = new Class93[16];
								for (local221 = 0; local221 < 16; local221++) {
									this.aClass93Array1[local221] = new Class93(new File(local121, "main_file_cache.idx" + local221), "rw", 1048576L);
								}
								this.aClass93_2 = new Class93(new File(local121, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local121;
							} catch (@Pc(267) Exception local267) {
								try {
									this.aClass93_3.method2942();
									for (local221 = 0; local221 < 16; local221++) {
										this.aClass93Array1[local221].method2942();
									}
									this.aClass93_2.method2942();
								} catch (@Pc(294) Exception local294) {
								}
								this.aClass93Array1 = null;
								this.aClass93_3 = this.aClass93_2 = null;
								this.aFile6 = this.aFile5 = null;
							}
						}
					} catch (@Pc(311) Exception local311) {
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

	@OriginalMember(owner = "loader!qd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class92 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean177) {
						return;
					}
					if (this.aClass92_3 != null) {
						local16 = this.aClass92_3;
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
				@Pc(46) int local46 = local16.anInt4028;
				if (local46 == 1) {
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject5), local16.anInt4027);
				} else if (local46 == 2) {
					@Pc(73) Thread local73 = new Thread((Runnable) local16.anObject5);
					local73.setDaemon(true);
					local73.start();
					local73.setPriority(local16.anInt4027);
					local16.anObject6 = local73;
				} else if (local46 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(109) Object[] local109;
					if (local46 == 8) {
						local109 = (Object[]) local16.anObject5;
						if (((Class) local109[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local109[0]).getDeclaredMethod((String) local109[1], (Class[]) local109[2]);
					} else if (local46 == 9) {
						local109 = (Object[]) local16.anObject5;
						if (((Class) local109[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local109[0]).getDeclaredField((String) local109[1]);
					} else if (local46 == 3) {
						@Pc(180) String local180 = (local16.anInt4027 >> 24 & 0xFF) + "." + (local16.anInt4027 >> 16 & 0xFF) + "." + (local16.anInt4027 >> 8 & 0xFF) + "." + (local16.anInt4027 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local180).getHostName();
					}
				}
				local16.anInt4026 = 1;
			} catch (@Pc(218) ThreadDeath local218) {
				throw local218;
			} catch (@Pc(221) Throwable local221) {
				local16.anInt4026 = 2;
			}
		}
	}
}
