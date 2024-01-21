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

@OriginalClass("loader!oc")
public final class Class85 implements Runnable {

	@OriginalMember(owner = "loader!oc", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!oc", name = "d", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!oc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!oc", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!oc", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!oc", name = "i", descriptor = "I")
	private static final int anInt3278 = 1;

	@OriginalMember(owner = "loader!oc", name = "k", descriptor = "[Lloader!ee;")
	private Class83[] aClass83Array1;

	@OriginalMember(owner = "loader!oc", name = "a", descriptor = "Lloader!pf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!oc", name = "o", descriptor = "Lloader!ee;")
	private Class83 aClass83_1 = null;

	@OriginalMember(owner = "loader!oc", name = "e", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!oc", name = "j", descriptor = "Lloader!ee;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!oc", name = "c", descriptor = "Lloader!n;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "loader!oc", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!oc", name = "n", descriptor = "Lloader!n;")
	private Class84 aClass84_3 = null;

	@OriginalMember(owner = "loader!oc", name = "r", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!oc", name = "m", descriptor = "I")
	private int anInt3279 = 0;

	@OriginalMember(owner = "loader!oc", name = "p", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "loader!oc", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!oc", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!oc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class85(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "1.1";
		aString7 = "Unknown";
		this.anApplet3 = arg1;
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
		} catch (@Pc(59) Exception local59) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(69) Throwable local69) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		this.method2284(arg4, arg3, arg2);
		this.aBoolean128 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!oc", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method2284(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(43) String[] local43 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(45) boolean local45 = false;
		@Pc(80) String[] local80 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		for (@Pc(82) int local82 = 0; local82 < 2; local82++) {
			for (@Pc(87) int local87 = 0; local87 < local43.length; local87++) {
				for (@Pc(93) int local93 = 0; local93 < local80.length; local93++) {
					try {
						@Pc(105) String local105 = local80[local93];
						if (local105.length() > 0 && !(new File(local105)).exists()) {
							continue;
						}
						@Pc(131) File local131 = new File(local105 + local43[local87]);
						@Pc(143) boolean local143;
						if (local82 == 1 && !local131.exists()) {
							local143 = local131.mkdir();
							if (!local143) {
								continue;
							}
						}
						@Pc(172) int local172;
						@Pc(156) File local156;
						if (!local45) {
							try {
								local156 = new File(local131, "uid.dat");
								if (local82 == 1 && (!local156.exists() || local156.length() < 4L)) {
									local172 = -1;
									@Pc(176) Random local176 = new Random();
									while (local172 == -1) {
										local172 = local176.nextInt();
									}
									@Pc(191) DataOutputStream local191 = new DataOutputStream(new FileOutputStream(local156));
									local191.writeInt(local172);
									local191.close();
								}
								if (local156.exists()) {
									local45 = true;
									@Pc(210) DataInputStream local210 = new DataInputStream(new FileInputStream(local156));
									this.anInt3279 = local210.readInt() + 1;
									local210.close();
								}
							} catch (@Pc(220) Exception local220) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local131 = new File(local131, arg1);
								if (local82 == 1 && !local131.exists()) {
									local143 = local131.mkdir();
									if (!local143) {
										continue;
									}
								}
								local156 = new File(local131, "main_file_cache.dat2");
								if (local82 == 0 && !local156.exists()) {
									continue;
								}
								this.aClass83_2 = new Class83(local156, "rw", 52428800L);
								this.aClass83Array1 = new Class83[16];
								for (local172 = 0; local172 < 16; local172++) {
									this.aClass83Array1[local172] = new Class83(new File(local131, "main_file_cache.idx" + local172), "rw", 1048576L);
								}
								this.aClass83_1 = new Class83(new File(local131, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local131;
							} catch (@Pc(321) Exception local321) {
								try {
									this.aClass83_2.method2273();
									for (local172 = 0; local172 < 16; local172++) {
										this.aClass83Array1[local172].method2273();
									}
									this.aClass83_1.method2273();
								} catch (@Pc(348) Exception local348) {
								}
								this.aClass83_2 = this.aClass83_1 = null;
								this.aFile6 = this.aFile5 = null;
								this.aClass83Array1 = null;
							}
						}
					} catch (@Pc(365) Exception local365) {
					}
					if (local45 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!oc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class84 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean128) {
						return;
					}
					if (this.aClass84_3 != null) {
						local17 = this.aClass84_3;
						this.aClass84_3 = this.aClass84_3.aClass84_1;
						if (this.aClass84_3 == null) {
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
				@Pc(46) int local46 = local17.anInt3277;
				if (local46 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt3275);
				} else if (local46 == 2) {
					@Pc(202) Thread local202 = new Thread((Runnable) local17.anObject6);
					local202.setDaemon(true);
					local202.start();
					local202.setPriority(local17.anInt3275);
					local17.anObject5 = local202;
				} else if (local46 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(89) Object[] local89;
					if (local46 == 8) {
						local89 = (Object[]) local17.anObject6;
						if (((Class) local89[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local89[0]).getDeclaredMethod((String) local89[1], (Class[]) local89[2]);
					} else if (local46 == 9) {
						local89 = (Object[]) local17.anObject6;
						if (((Class) local89[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local89[0]).getDeclaredField((String) local89[1]);
					} else if (local46 == 3) {
						@Pc(162) String local162 = (local17.anInt3275 >> 24 & 0xFF) + "." + (local17.anInt3275 >> 16 & 0xFF) + "." + (local17.anInt3275 >> 8 & 0xFF) + "." + (local17.anInt3275 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local162).getHostName();
					}
				}
				local17.anInt3276 = 1;
			} catch (@Pc(219) ThreadDeath local219) {
				throw local219;
			} catch (@Pc(222) Throwable local222) {
				local17.anInt3276 = 2;
			}
		}
	}
}
