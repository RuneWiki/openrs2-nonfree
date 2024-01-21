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

@OriginalClass("loader!ve")
public final class Class87 implements Runnable {

	@OriginalMember(owner = "loader!ve", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!ve", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!ve", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ve", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!ve", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ve", name = "f", descriptor = "I")
	private static final int anInt2985 = 1;

	@OriginalMember(owner = "loader!ve", name = "k", descriptor = "Lloader!ic;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "[Lloader!pc;")
	private Class86[] aClass86Array1;

	@OriginalMember(owner = "loader!ve", name = "r", descriptor = "Lloader!ke;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!ve", name = "c", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "loader!ve", name = "d", descriptor = "Lloader!pc;")
	private Class86 aClass86_2 = null;

	@OriginalMember(owner = "loader!ve", name = "g", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!ve", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ve", name = "l", descriptor = "Lloader!pc;")
	private Class86 aClass86_1 = null;

	@OriginalMember(owner = "loader!ve", name = "o", descriptor = "Lloader!ke;")
	private Class85 aClass85_3 = null;

	@OriginalMember(owner = "loader!ve", name = "p", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ve", name = "b", descriptor = "Lloader!pc;")
	private Class86 aClass86_3 = null;

	@OriginalMember(owner = "loader!ve", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ve", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ve", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class87(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString8 = "1.1";
		aString7 = "Unknown";
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
		} catch (@Pc(61) Exception local61) {
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
		this.method2035(arg2, arg3, arg4);
		this.aBoolean132 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ve", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class85 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean132) {
						return;
					}
					if (this.aClass85_3 != null) {
						local17 = this.aClass85_3;
						this.aClass85_3 = this.aClass85_3.aClass85_1;
						if (this.aClass85_3 == null) {
							this.aClass85_2 = null;
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
				@Pc(46) int local46 = local17.anInt2982;
				if (local46 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt2981);
				} else if (local46 == 2) {
					@Pc(73) Thread local73 = new Thread((Runnable) local17.anObject5);
					local73.setDaemon(true);
					local73.start();
					local73.setPriority(local17.anInt2981);
					local17.anObject6 = local73;
				} else if (local46 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local46 == 8) {
						local102 = (Object[]) local17.anObject5;
						if (((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local46 == 9) {
						local102 = (Object[]) local17.anObject5;
						if (((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local46 == 3) {
						@Pc(168) String local168 = (local17.anInt2981 >> 24 & 0xFF) + "." + (local17.anInt2981 >> 16 & 0xFF) + "." + (local17.anInt2981 >> 8 & 0xFF) + "." + (local17.anInt2981 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local168).getHostName();
					}
				}
				local17.anInt2980 = 1;
			} catch (@Pc(220) ThreadDeath local220) {
				throw local220;
			} catch (@Pc(223) Throwable local223) {
				local17.anInt2980 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!ve", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method2035(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(33) String[] local33 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(68) String[] local68 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(75) int local75 = 0; local75 < local33.length; local75++) {
				for (@Pc(85) int local85 = 0; local85 < local68.length; local85++) {
					try {
						@Pc(93) String local93 = local68[local85];
						if (local93.length() > 0 && !(new File(local93)).exists()) {
							continue;
						}
						@Pc(120) File local120 = new File(local93 + local33[local75]);
						@Pc(131) boolean local131;
						if (local70 == 1 && !local120.exists()) {
							local131 = local120.mkdir();
							if (!local131) {
								continue;
							}
						}
						@Pc(144) File local144;
						if (this.aClass86_3 == null) {
							try {
								local144 = new File(local120, "random.dat");
								if (local70 == 1 || local144.exists()) {
									this.aClass86_3 = new Class86(local144, "rw", 25L);
								}
							} catch (@Pc(160) Exception local160) {
								this.aClass86_3 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(215) int local215;
							try {
								local120 = new File(local120, arg1);
								if (local70 == 1 && !local120.exists()) {
									local131 = local120.mkdir();
									if (!local131) {
										continue;
									}
								}
								local144 = new File(local120, "main_file_cache.dat2");
								if (local70 == 0 && !local144.exists()) {
									continue;
								}
								this.aClass86_2 = new Class86(local144, "rw", 52428800L);
								this.aClass86Array1 = new Class86[16];
								for (local215 = 0; local215 < 16; local215++) {
									this.aClass86Array1[local215] = new Class86(new File(local120, "main_file_cache.idx" + local215), "rw", 1048576L);
								}
								this.aClass86_1 = new Class86(new File(local120, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local120;
							} catch (@Pc(261) Exception local261) {
								try {
									this.aClass86_2.method2030();
									for (local215 = 0; local215 < 16; local215++) {
										this.aClass86Array1[local215].method2030();
									}
									this.aClass86_1.method2030();
								} catch (@Pc(284) Exception local284) {
								}
								this.aClass86Array1 = null;
								this.aClass86_2 = this.aClass86_1 = null;
								this.aFile5 = this.aFile6 = null;
							}
						}
					} catch (@Pc(301) Exception local301) {
					}
					if (this.aClass86_3 != null && this.aFile6 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile6 == null) {
			throw new RuntimeException();
		}
	}
}
