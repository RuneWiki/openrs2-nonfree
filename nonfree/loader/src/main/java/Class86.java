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

@OriginalClass("loader!df")
public final class Class86 implements Runnable {

	@OriginalMember(owner = "loader!df", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!df", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!df", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!df", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!df", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!df", name = "g", descriptor = "I")
	private static final int anInt2987 = 1;

	@OriginalMember(owner = "loader!df", name = "m", descriptor = "[Lloader!oa;")
	private Class87[] aClass87Array1;

	@OriginalMember(owner = "loader!df", name = "q", descriptor = "Lloader!ic;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!df", name = "o", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!df", name = "h", descriptor = "Lloader!oa;")
	private Class87 aClass87_1 = null;

	@OriginalMember(owner = "loader!df", name = "b", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "loader!df", name = "p", descriptor = "Lloader!oa;")
	private Class87 aClass87_3 = null;

	@OriginalMember(owner = "loader!df", name = "n", descriptor = "Lloader!cf;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!df", name = "a", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!df", name = "k", descriptor = "Lloader!cf;")
	private Class85 aClass85_3 = null;

	@OriginalMember(owner = "loader!df", name = "s", descriptor = "Lloader!oa;")
	private Class87 aClass87_2 = null;

	@OriginalMember(owner = "loader!df", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!df", name = "j", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!df", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!df", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
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
		this.method2124(arg4, arg2, arg3);
		this.aBoolean133 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!df", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class85 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean133) {
						return;
					}
					if (this.aClass85_2 != null) {
						local17 = this.aClass85_2;
						this.aClass85_2 = this.aClass85_2.aClass85_1;
						if (this.aClass85_2 == null) {
							this.aClass85_3 = null;
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
				@Pc(45) int local45 = local17.anInt2984;
				if (local45 == 1) {
					local17.anObject66 = new Socket(InetAddress.getByName((String) local17.anObject67), local17.anInt2986);
				} else if (local45 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local17.anObject67);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local17.anInt2986);
					local17.anObject66 = local60;
				} else if (local45 == 4) {
					local17.anObject66 = new DataInputStream(((URL) local17.anObject67).openStream());
				} else {
					@Pc(84) Object[] local84;
					if (local45 == 8) {
						local84 = (Object[]) local17.anObject67;
						if (((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject66 = ((Class) local84[0]).getDeclaredMethod((String) local84[1], (Class[]) local84[2]);
					} else if (local45 == 9) {
						local84 = (Object[]) local17.anObject67;
						if (((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject66 = ((Class) local84[0]).getDeclaredField((String) local84[1]);
					} else if (local45 == 3) {
						@Pc(156) String local156 = (local17.anInt2986 >> 24 & 0xFF) + "." + (local17.anInt2986 >> 16 & 0xFF) + "." + (local17.anInt2986 >> 8 & 0xFF) + "." + (local17.anInt2986 & 0xFF);
						local17.anObject66 = InetAddress.getByName(local156).getHostName();
					}
				}
				local17.anInt2985 = 1;
			} catch (@Pc(216) ThreadDeath local216) {
				throw local216;
			} catch (@Pc(219) Throwable local219) {
				local17.anInt2985 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!df", name = "a", descriptor = "(IZILjava/lang/String;)V")
	private void method2124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(79) String[] local79 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(86) int local86 = 0; local86 < local79.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local34.length; local92++) {
					try {
						@Pc(100) String local100 = local34[local92];
						if (local100.length() > 0 && !(new File(local100)).exists()) {
							continue;
						}
						@Pc(128) File local128 = new File(local100 + local79[local86]);
						@Pc(140) boolean local140;
						if (local81 == 1 && !local128.exists()) {
							local140 = local128.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(153) File local153;
						if (this.aClass87_1 == null) {
							try {
								local153 = new File(local128, "random.dat");
								if (local81 == 1 || local153.exists()) {
									this.aClass87_1 = new Class87(local153, "rw", 25L);
								}
							} catch (@Pc(172) Exception local172) {
								this.aClass87_1 = null;
							}
						}
						if (this.aFile4 == null) {
							@Pc(230) int local230;
							try {
								local128 = new File(local128, arg2);
								if (local81 == 1 && !local128.exists()) {
									local140 = local128.mkdir();
									if (!local140) {
										continue;
									}
								}
								local153 = new File(local128, "main_file_cache.dat2");
								if (local81 == 0 && !local153.exists()) {
									continue;
								}
								this.aClass87_3 = new Class87(local153, "rw", 52428800L);
								this.aClass87Array1 = new Class87[16];
								for (local230 = 0; local230 < 16; local230++) {
									this.aClass87Array1[local230] = new Class87(new File(local128, "main_file_cache.idx" + local230), "rw", 1048576L);
								}
								this.aClass87_2 = new Class87(new File(local128, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local128;
							} catch (@Pc(280) Exception local280) {
								try {
									this.aClass87_3.method2139();
									for (local230 = 0; local230 < 16; local230++) {
										this.aClass87Array1[local230].method2139();
									}
									this.aClass87_2.method2139();
								} catch (@Pc(303) Exception local303) {
								}
								this.aFile5 = this.aFile4 = null;
								this.aClass87_3 = this.aClass87_2 = null;
								this.aClass87Array1 = null;
							}
						}
					} catch (@Pc(320) Exception local320) {
					}
					if (this.aClass87_1 != null && this.aFile4 != null) {
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
