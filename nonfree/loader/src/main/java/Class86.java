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

@OriginalClass("loader!cf")
public final class Class86 implements Runnable {

	@OriginalMember(owner = "loader!cf", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!cf", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!cf", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!cf", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!cf", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!cf", name = "k", descriptor = "I")
	private static final int anInt2847 = 1;

	@OriginalMember(owner = "loader!cf", name = "l", descriptor = "Lloader!j;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!cf", name = "e", descriptor = "[Lloader!ca;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "loader!cf", name = "d", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!cf", name = "o", descriptor = "Lloader!ca;")
	private Class85 aClass85_3 = null;

	@OriginalMember(owner = "loader!cf", name = "a", descriptor = "Lloader!fc;")
	private Class87 aClass87_1 = null;

	@OriginalMember(owner = "loader!cf", name = "j", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!cf", name = "r", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "loader!cf", name = "b", descriptor = "Lloader!fc;")
	private Class87 aClass87_2 = null;

	@OriginalMember(owner = "loader!cf", name = "h", descriptor = "Lloader!ca;")
	private Class85 aClass85_1 = null;

	@OriginalMember(owner = "loader!cf", name = "q", descriptor = "Lloader!ca;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!cf", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!cf", name = "c", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!cf", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!cf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class86(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet2 = arg1;
		aString7 = "1.1";
		aString8 = "Unknown";
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
		} catch (@Pc(127) Exception local127) {
		}
		this.method2042(arg4, arg2, arg3);
		this.aBoolean161 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!cf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class87 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean161) {
						return;
					}
					if (this.aClass87_2 != null) {
						local16 = this.aClass87_2;
						this.aClass87_2 = this.aClass87_2.aClass87_3;
						if (this.aClass87_2 == null) {
							this.aClass87_1 = null;
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
				@Pc(45) int local45 = local16.anInt2848;
				if (local45 == 1) {
					local16.anObject37 = new Socket(InetAddress.getByName((String) local16.anObject36), local16.anInt2850);
				} else if (local45 == 2) {
					@Pc(74) Thread local74 = new Thread((Runnable) local16.anObject36);
					local74.setDaemon(true);
					local74.start();
					local74.setPriority(local16.anInt2850);
					local16.anObject37 = local74;
				} else if (local45 == 4) {
					local16.anObject37 = new DataInputStream(((URL) local16.anObject36).openStream());
				} else {
					@Pc(112) Object[] local112;
					if (local45 == 8) {
						local112 = (Object[]) local16.anObject36;
						if (((Class) local112[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject37 = ((Class) local112[0]).getDeclaredMethod((String) local112[1], (Class[]) local112[2]);
					} else if (local45 == 9) {
						local112 = (Object[]) local16.anObject36;
						if (((Class) local112[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject37 = ((Class) local112[0]).getDeclaredField((String) local112[1]);
					} else if (local45 == 3) {
						@Pc(215) String local215 = (local16.anInt2850 >> 24 & 0xFF) + "." + (local16.anInt2850 >> 16 & 0xFF) + "." + (local16.anInt2850 >> 8 & 0xFF) + "." + (local16.anInt2850 & 0xFF);
						local16.anObject37 = InetAddress.getByName(local215).getHostName();
					}
				}
				local16.anInt2849 = 1;
			} catch (@Pc(225) ThreadDeath local225) {
				throw local225;
			} catch (@Pc(228) Throwable local228) {
				local16.anInt2849 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!cf", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method2042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(86) int local86 = 0; local86 < local69.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local44.length; local96++) {
					try {
						@Pc(104) String local104 = local44[local96];
						if (local104.length() > 0 && !(new File(local104)).exists()) {
							continue;
						}
						@Pc(132) File local132 = new File(local104 + local69[local86]);
						@Pc(142) boolean local142;
						if (local81 == 1 && !local132.exists()) {
							local142 = local132.mkdir();
							if (!local142) {
								continue;
							}
						}
						@Pc(155) File local155;
						if (this.aClass85_3 == null) {
							try {
								local155 = new File(local132, "random.dat");
								if (local81 == 1 || local155.exists()) {
									this.aClass85_3 = new Class85(local155, "rw", 25L);
								}
							} catch (@Pc(171) Exception local171) {
								this.aClass85_3 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(224) int local224;
							try {
								local132 = new File(local132, arg2);
								if (local81 == 1 && !local132.exists()) {
									local142 = local132.mkdir();
									if (!local142) {
										continue;
									}
								}
								local155 = new File(local132, "main_file_cache.dat2");
								if (local81 == 0 && !local155.exists()) {
									continue;
								}
								this.aClass85_1 = new Class85(local155, "rw", 52428800L);
								this.aClass85Array1 = new Class85[16];
								for (local224 = 0; local224 < 16; local224++) {
									this.aClass85Array1[local224] = new Class85(new File(local132, "main_file_cache.idx" + local224), "rw", 1048576L);
								}
								this.aClass85_2 = new Class85(new File(local132, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local132;
							} catch (@Pc(270) Exception local270) {
								try {
									this.aClass85_1.method2035();
									for (local224 = 0; local224 < 16; local224++) {
										this.aClass85Array1[local224].method2035();
									}
									this.aClass85_2.method2035();
								} catch (@Pc(293) Exception local293) {
								}
								this.aClass85Array1 = null;
								this.aClass85_1 = this.aClass85_2 = null;
								this.aFile6 = this.aFile5 = null;
							}
						}
					} catch (@Pc(310) Exception local310) {
					}
					if (this.aClass85_3 != null && this.aFile5 != null) {
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
