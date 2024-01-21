import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ba")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "loader!ba", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!ba", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!ba", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ba", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!ba", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ba", name = "k", descriptor = "I")
	private static final int anInt2895 = 1;

	@OriginalMember(owner = "loader!ba", name = "d", descriptor = "[Lloader!e;")
	private Class83[] aClass83Array1;

	@OriginalMember(owner = "loader!ba", name = "i", descriptor = "Lloader!ab;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ba", name = "l", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!ba", name = "m", descriptor = "Lloader!ef;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "loader!ba", name = "a", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ba", name = "h", descriptor = "Lloader!e;")
	private Class83 aClass83_1 = null;

	@OriginalMember(owner = "loader!ba", name = "g", descriptor = "Lloader!ef;")
	private Class84 aClass84_1 = null;

	@OriginalMember(owner = "loader!ba", name = "e", descriptor = "Lloader!e;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!ba", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ba", name = "p", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "loader!ba", name = "j", descriptor = "I")
	private int anInt2896 = 0;

	@OriginalMember(owner = "loader!ba", name = "s", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ba", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ba", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class81(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "1.1";
		aString9 = "Unknown";
		this.anApplet2 = arg1;
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
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method1991(arg3, arg4, arg2);
		this.aBoolean131 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class84 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean131) {
						return;
					}
					if (this.aClass84_1 != null) {
						local16 = this.aClass84_1;
						this.aClass84_1 = this.aClass84_1.aClass84_3;
						if (this.aClass84_1 == null) {
							this.aClass84_2 = null;
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
				@Pc(46) int local46 = local16.anInt2898;
				if (local46 == 1) {
					local16.anObject5 = new Socket(InetAddress.getByName((String) local16.anObject6), local16.anInt2899);
				} else if (local46 == 2) {
					@Pc(198) Thread local198 = new Thread((Runnable) local16.anObject6);
					local198.setDaemon(true);
					local198.start();
					local198.setPriority(local16.anInt2899);
					local16.anObject5 = local198;
				} else if (local46 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(71) Object[] local71;
					if (local46 == 9) {
						local71 = (Object[]) local16.anObject6;
						if (((Class) local71[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local71[0]).getDeclaredMethod((String) local71[1], (Class[]) local71[2]);
					} else if (local46 == 10) {
						local71 = (Object[]) local16.anObject6;
						if (((Class) local71[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local71[0]).getDeclaredField((String) local71[1]);
					} else if (local46 == 3) {
						@Pc(148) String local148 = (local16.anInt2899 >> 24 & 0xFF) + "." + (local16.anInt2899 >> 16 & 0xFF) + "." + (local16.anInt2899 >> 8 & 0xFF) + "." + (local16.anInt2899 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local148).getHostName();
					}
				}
				local16.anInt2897 = 1;
			} catch (@Pc(227) ThreadDeath local227) {
				throw local227;
			} catch (@Pc(230) Throwable local230) {
				local16.anInt2897 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!ba", name = "a", descriptor = "(Ljava/lang/String;IIB)V")
	private void method1991(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString7, "" };
		@Pc(46) boolean local46 = false;
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(80) int local80 = 0; local80 < local71.length; local80++) {
				for (@Pc(90) int local90 = 0; local90 < local44.length; local90++) {
					try {
						@Pc(102) String local102 = local44[local90];
						if (local102.length() > 0 && !(new File(local102)).exists()) {
							continue;
						}
						@Pc(129) File local129 = new File(local102 + local71[local80]);
						@Pc(141) boolean local141;
						if (local73 == 1 && !local129.exists()) {
							local141 = local129.mkdir();
							if (!local141) {
								continue;
							}
						}
						@Pc(168) int local168;
						@Pc(153) File local153;
						if (!local46) {
							try {
								local153 = new File(local129, "uid.dat");
								if (local73 == 1 && (!local153.exists() || local153.length() < 4L)) {
									local168 = -1;
									@Pc(172) Random local172 = new Random();
									while (local168 == -1) {
										local168 = local172.nextInt();
									}
									@Pc(188) DataOutputStream local188 = new DataOutputStream(new FileOutputStream(local153));
									local188.writeInt(local168);
									local188.close();
								}
								if (local153.exists()) {
									@Pc(204) DataInputStream local204 = new DataInputStream(new FileInputStream(local153));
									this.anInt2896 = local204.readInt() + 1;
									local204.close();
									local46 = true;
								}
							} catch (@Pc(216) Exception local216) {
							}
						}
						if (this.aFile4 == null) {
							try {
								local129 = new File(local129, arg0);
								if (local73 == 1 && !local129.exists()) {
									local141 = local129.mkdir();
									if (!local141) {
										continue;
									}
								}
								local153 = new File(local129, "main_file_cache.dat2");
								if (local73 == 0 && !local153.exists()) {
									continue;
								}
								this.aClass83_2 = new Class83(local153, "rw", 52428800L);
								this.aClass83Array1 = new Class83[16];
								for (local168 = 0; local168 < 16; local168++) {
									this.aClass83Array1[local168] = new Class83(new File(local129, "main_file_cache.idx" + local168), "rw", 1048576L);
								}
								this.aClass83_1 = new Class83(new File(local129, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local129;
							} catch (@Pc(317) Exception local317) {
								try {
									this.aClass83_2.method1997();
									for (local168 = 0; local168 < 16; local168++) {
										this.aClass83Array1[local168].method1997();
									}
									this.aClass83_1.method1997();
								} catch (@Pc(344) Exception local344) {
								}
								this.aClass83_2 = this.aClass83_1 = null;
								this.aClass83Array1 = null;
								this.aFile5 = this.aFile4 = null;
							}
						}
					} catch (@Pc(361) Exception local361) {
					}
					if (local46 && this.aFile4 != null) {
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
