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

@OriginalClass("loader!bb")
public final class Class85 implements Runnable {

	@OriginalMember(owner = "loader!bb", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "loader!bb", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!bb", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!bb", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!bb", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!bb", name = "m", descriptor = "I")
	private static final int anInt2958 = 1;

	@OriginalMember(owner = "loader!bb", name = "g", descriptor = "[Lloader!pe;")
	private Class87[] aClass87Array1;

	@OriginalMember(owner = "loader!bb", name = "b", descriptor = "Lloader!d;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!bb", name = "f", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!bb", name = "d", descriptor = "Lloader!pe;")
	private Class87 aClass87_2 = null;

	@OriginalMember(owner = "loader!bb", name = "i", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!bb", name = "a", descriptor = "Lloader!pe;")
	private Class87 aClass87_1 = null;

	@OriginalMember(owner = "loader!bb", name = "k", descriptor = "Lloader!pe;")
	private Class87 aClass87_3 = null;

	@OriginalMember(owner = "loader!bb", name = "j", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "loader!bb", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!bb", name = "q", descriptor = "Lloader!ie;")
	private Class86 aClass86_2 = null;

	@OriginalMember(owner = "loader!bb", name = "o", descriptor = "Lloader!ie;")
	private Class86 aClass86_1 = null;

	@OriginalMember(owner = "loader!bb", name = "r", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!bb", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!bb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class85(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "1.1";
		aString6 = "Unknown";
		this.anApplet2 = arg1;
		try {
			aString6 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
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
		} catch (@Pc(127) Exception local127) {
		}
		this.method2067(arg4, arg2, arg3);
		this.aBoolean120 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!bb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class86 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean120) {
						return;
					}
					if (this.aClass86_2 != null) {
						local16 = this.aClass86_2;
						this.aClass86_2 = this.aClass86_2.aClass86_3;
						if (this.aClass86_2 == null) {
							this.aClass86_1 = null;
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
				@Pc(45) int local45 = local16.anInt2961;
				if (local45 == 1) {
					local16.anObject7 = new Socket(InetAddress.getByName((String) local16.anObject6), local16.anInt2962);
				} else if (local45 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local16.anObject6);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local16.anInt2962);
					local16.anObject7 = local58;
				} else if (local45 == 4) {
					local16.anObject7 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(94) Object[] local94;
					if (local45 == 8) {
						local94 = (Object[]) local16.anObject6;
						if (((Class) local94[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject7 = ((Class) local94[0]).getDeclaredMethod((String) local94[1], (Class[]) local94[2]);
					} else if (local45 == 9) {
						local94 = (Object[]) local16.anObject6;
						if (((Class) local94[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject7 = ((Class) local94[0]).getDeclaredField((String) local94[1]);
					} else if (local45 == 3) {
						@Pc(197) String local197 = (local16.anInt2962 >> 24 & 0xFF) + "." + (local16.anInt2962 >> 16 & 0xFF) + "." + (local16.anInt2962 >> 8 & 0xFF) + "." + (local16.anInt2962 & 0xFF);
						local16.anObject7 = InetAddress.getByName(local197).getHostName();
					}
				}
				local16.anInt2960 = 1;
			} catch (@Pc(219) ThreadDeath local219) {
				throw local219;
			} catch (@Pc(222) Throwable local222) {
				local16.anInt2960 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!bb", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method2067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(37) String[] local37 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(72) String[] local72 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		for (@Pc(74) int local74 = 0; local74 < 2; local74++) {
			for (@Pc(79) int local79 = 0; local79 < local37.length; local79++) {
				for (@Pc(85) int local85 = 0; local85 < local72.length; local85++) {
					try {
						@Pc(97) String local97 = local72[local85];
						if (local97.length() > 0 && !(new File(local97)).exists()) {
							continue;
						}
						@Pc(124) File local124 = new File(local97 + local37[local79]);
						@Pc(136) boolean local136;
						if (local74 == 1 && !local124.exists()) {
							local136 = local124.mkdir();
							if (!local136) {
								continue;
							}
						}
						@Pc(148) File local148;
						if (this.aClass87_3 == null) {
							try {
								local148 = new File(local124, "random.dat");
								if (local74 == 1 || local148.exists()) {
									this.aClass87_3 = new Class87(local148, "rw", 25L);
								}
							} catch (@Pc(165) Exception local165) {
								this.aClass87_3 = null;
							}
						}
						if (this.aFile4 == null) {
							@Pc(221) int local221;
							try {
								local124 = new File(local124, arg2);
								if (local74 == 1 && !local124.exists()) {
									local136 = local124.mkdir();
									if (!local136) {
										continue;
									}
								}
								local148 = new File(local124, "main_file_cache.dat2");
								if (local74 == 0 && !local148.exists()) {
									continue;
								}
								this.aClass87_2 = new Class87(local148, "rw", 52428800L);
								this.aClass87Array1 = new Class87[16];
								for (local221 = 0; local221 < 16; local221++) {
									this.aClass87Array1[local221] = new Class87(new File(local124, "main_file_cache.idx" + local221), "rw", 1048576L);
								}
								this.aClass87_1 = new Class87(new File(local124, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local124;
							} catch (@Pc(271) Exception local271) {
								try {
									this.aClass87_2.method2087();
									for (local221 = 0; local221 < 16; local221++) {
										this.aClass87Array1[local221].method2087();
									}
									this.aClass87_1.method2087();
								} catch (@Pc(298) Exception local298) {
								}
								this.aFile5 = this.aFile4 = null;
								this.aClass87Array1 = null;
								this.aClass87_2 = this.aClass87_1 = null;
							}
						}
					} catch (@Pc(315) Exception local315) {
					}
					if (this.aClass87_3 != null && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}
}
