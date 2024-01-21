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

@OriginalClass("loader!ke")
public final class Class94 implements Runnable {

	@OriginalMember(owner = "loader!ke", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!ke", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!ke", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString11;

	@OriginalMember(owner = "loader!ke", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ke", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ke", name = "o", descriptor = "I")
	private static final int anInt4083 = 1;

	@OriginalMember(owner = "loader!ke", name = "l", descriptor = "[Lloader!sa;")
	private Class95[] aClass95Array1;

	@OriginalMember(owner = "loader!ke", name = "q", descriptor = "Lloader!fg;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ke", name = "a", descriptor = "Lloader!sa;")
	private Class95 aClass95_2 = null;

	@OriginalMember(owner = "loader!ke", name = "d", descriptor = "Lloader!sa;")
	private Class95 aClass95_1 = null;

	@OriginalMember(owner = "loader!ke", name = "i", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!ke", name = "f", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "loader!ke", name = "s", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ke", name = "n", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ke", name = "c", descriptor = "Lloader!sa;")
	private Class95 aClass95_3 = null;

	@OriginalMember(owner = "loader!ke", name = "g", descriptor = "Lloader!da;")
	private Class93 aClass93_2 = null;

	@OriginalMember(owner = "loader!ke", name = "p", descriptor = "Lloader!da;")
	private Class93 aClass93_3 = null;

	@OriginalMember(owner = "loader!ke", name = "j", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ke", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ke", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class94(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString10 = "Unknown";
		this.anApplet2 = arg1;
		aString11 = "1.1";
		try {
			aString10 = System.getProperty("java.vendor");
			aString11 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		this.method3058(arg4, arg3, arg2);
		this.aBoolean177 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ke", name = "a", descriptor = "(IBLjava/lang/String;I)V")
	private void method3058(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(81) int local81 = 0; local81 < local74.length; local81++) {
				for (@Pc(91) int local91 = 0; local91 < local43.length; local91++) {
					try {
						@Pc(103) String local103 = local43[local91];
						if (local103.length() > 0 && !(new File(local103)).exists()) {
							continue;
						}
						@Pc(128) File local128 = new File(local103 + local74[local81]);
						@Pc(140) boolean local140;
						if (local76 == 1 && !local128.exists()) {
							local140 = local128.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(153) File local153;
						if (this.aClass95_1 == null) {
							try {
								local153 = new File(local128, "random.dat");
								if (local76 == 1 || local153.exists()) {
									this.aClass95_1 = new Class95(local153, "rw", 25L);
								}
							} catch (@Pc(170) Exception local170) {
								this.aClass95_1 = null;
							}
						}
						if (this.aFile4 == null) {
							@Pc(224) int local224;
							try {
								local128 = new File(local128, arg1);
								if (local76 == 1 && !local128.exists()) {
									local140 = local128.mkdir();
									if (!local140) {
										continue;
									}
								}
								local153 = new File(local128, "main_file_cache.dat2");
								if (local76 == 0 && !local153.exists()) {
									continue;
								}
								this.aClass95_2 = new Class95(local153, "rw", 104857600L);
								this.aClass95Array1 = new Class95[16];
								for (local224 = 0; local224 < 16; local224++) {
									this.aClass95Array1[local224] = new Class95(new File(local128, "main_file_cache.idx" + local224), "rw", 1048576L);
								}
								this.aClass95_3 = new Class95(new File(local128, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local128;
							} catch (@Pc(270) Exception local270) {
								try {
									this.aClass95_2.method3075();
									for (local224 = 0; local224 < 16; local224++) {
										this.aClass95Array1[local224].method3075();
									}
									this.aClass95_3.method3075();
								} catch (@Pc(293) Exception local293) {
								}
								this.aFile5 = this.aFile4 = null;
								this.aClass95Array1 = null;
								this.aClass95_2 = this.aClass95_3 = null;
							}
						}
					} catch (@Pc(310) Exception local310) {
					}
					if (this.aClass95_1 != null && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!ke", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class93 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean177) {
						return;
					}
					if (this.aClass93_2 != null) {
						local17 = this.aClass93_2;
						this.aClass93_2 = this.aClass93_2.aClass93_1;
						if (this.aClass93_2 == null) {
							this.aClass93_3 = null;
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
				@Pc(46) int local46 = local17.anInt4080;
				if (local46 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt4081);
				} else if (local46 == 2) {
					@Pc(209) Thread local209 = new Thread((Runnable) local17.anObject5);
					local209.setDaemon(true);
					local209.start();
					local209.setPriority(local17.anInt4081);
					local17.anObject6 = local209;
				} else if (local46 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(93) Object[] local93;
					if (local46 == 8) {
						local93 = (Object[]) local17.anObject5;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local93[0]).getDeclaredMethod((String) local93[1], (Class[]) local93[2]);
					} else if (local46 == 9) {
						local93 = (Object[]) local17.anObject5;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local93[0]).getDeclaredField((String) local93[1]);
					} else if (local46 == 3) {
						@Pc(196) String local196 = (local17.anInt4081 >> 24 & 0xFF) + "." + (local17.anInt4081 >> 16 & 0xFF) + "." + (local17.anInt4081 >> 8 & 0xFF) + "." + (local17.anInt4081 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local196).getHostName();
					}
				}
				local17.anInt4082 = 1;
			} catch (@Pc(226) ThreadDeath local226) {
				throw local226;
			} catch (@Pc(229) Throwable local229) {
				local17.anInt4082 = 2;
			}
		}
	}
}
