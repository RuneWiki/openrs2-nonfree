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

@OriginalClass("loader!dd")
public final class Class85 implements Runnable {

	@OriginalMember(owner = "loader!dd", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!dd", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!dd", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!dd", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!dd", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!dd", name = "s", descriptor = "I")
	private static final int anInt3177 = 1;

	@OriginalMember(owner = "loader!dd", name = "c", descriptor = "[Lloader!ab;")
	private Class83[] aClass83Array1;

	@OriginalMember(owner = "loader!dd", name = "o", descriptor = "Lloader!r;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!dd", name = "q", descriptor = "Lloader!ab;")
	private Class83 aClass83_1 = null;

	@OriginalMember(owner = "loader!dd", name = "a", descriptor = "Lloader!tf;")
	private Class86 aClass86_1 = null;

	@OriginalMember(owner = "loader!dd", name = "j", descriptor = "I")
	private int anInt3176 = 0;

	@OriginalMember(owner = "loader!dd", name = "m", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!dd", name = "n", descriptor = "Lloader!ab;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!dd", name = "g", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "loader!dd", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!dd", name = "r", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!dd", name = "p", descriptor = "Lloader!tf;")
	private Class86 aClass86_2 = null;

	@OriginalMember(owner = "loader!dd", name = "d", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!dd", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!dd", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class85(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
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
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		this.method2126(arg2, arg4, arg3);
		this.aBoolean188 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!dd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class86 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean188) {
						return;
					}
					if (this.aClass86_1 != null) {
						local17 = this.aClass86_1;
						this.aClass86_1 = this.aClass86_1.aClass86_3;
						if (this.aClass86_1 == null) {
							this.aClass86_2 = null;
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
				@Pc(47) int local47 = local17.anInt3182;
				if (local47 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt3180);
				} else if (local47 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local17.anObject6);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local17.anInt3180);
					local17.anObject5 = local62;
				} else if (local47 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(101) Object[] local101;
					if (local47 == 8) {
						local101 = (Object[]) local17.anObject6;
						if (((Class) local101[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local101[0]).getDeclaredMethod((String) local101[1], (Class[]) local101[2]);
					} else if (local47 == 9) {
						local101 = (Object[]) local17.anObject6;
						if (((Class) local101[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local101[0]).getDeclaredField((String) local101[1]);
					} else if (local47 == 3) {
						@Pc(165) String local165 = (local17.anInt3180 >> 24 & 0xFF) + "." + (local17.anInt3180 >> 16 & 0xFF) + "." + (local17.anInt3180 >> 8 & 0xFF) + "." + (local17.anInt3180 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local165).getHostName();
					}
				}
				local17.anInt3181 = 1;
			} catch (@Pc(221) ThreadDeath local221) {
				throw local221;
			} catch (@Pc(224) Throwable local224) {
				local17.anInt3181 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!dd", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method2126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(75) boolean local75 = false;
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(84) int local84 = 0; local84 < local73.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local42.length; local90++) {
					try {
						@Pc(98) String local98 = local42[local90];
						if (local98.length() > 0 && !(new File(local98)).exists()) {
							continue;
						}
						@Pc(123) File local123 = new File(local98 + local73[local84]);
						@Pc(132) boolean local132;
						if (local77 == 1 && !local123.exists()) {
							local132 = local123.mkdir();
							if (!local132) {
								continue;
							}
						}
						@Pc(158) int local158;
						@Pc(143) File local143;
						if (!local75) {
							try {
								local143 = new File(local123, "uid.dat");
								if (local77 == 1 && (!local143.exists() || local143.length() < 4L)) {
									local158 = -1;
									@Pc(162) Random local162 = new Random();
									while (local158 == -1) {
										local158 = local162.nextInt();
									}
									@Pc(179) DataOutputStream local179 = new DataOutputStream(new FileOutputStream(local143));
									local179.writeInt(local158);
									local179.close();
								}
								if (local143.exists()) {
									local75 = true;
									@Pc(197) DataInputStream local197 = new DataInputStream(new FileInputStream(local143));
									this.anInt3176 = local197.readInt() + 1;
									local197.close();
								}
							} catch (@Pc(207) Exception local207) {
							}
						}
						if (this.aFile6 == null) {
							try {
								local123 = new File(local123, arg2);
								if (local77 == 1 && !local123.exists()) {
									local132 = local123.mkdir();
									if (!local132) {
										continue;
									}
								}
								local143 = new File(local123, "main_file_cache.dat2");
								if (local77 == 0 && !local143.exists()) {
									continue;
								}
								this.aClass83_2 = new Class83(local143, "rw", 52428800L);
								this.aClass83Array1 = new Class83[16];
								for (local158 = 0; local158 < 16; local158++) {
									this.aClass83Array1[local158] = new Class83(new File(local123, "main_file_cache.idx" + local158), "rw", 1048576L);
								}
								this.aClass83_1 = new Class83(new File(local123, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local123;
							} catch (@Pc(308) Exception local308) {
								try {
									this.aClass83_2.method2112();
									for (local158 = 0; local158 < 16; local158++) {
										this.aClass83Array1[local158].method2112();
									}
									this.aClass83_1.method2112();
								} catch (@Pc(335) Exception local335) {
								}
								this.aClass83Array1 = null;
								this.aFile5 = this.aFile6 = null;
								this.aClass83_2 = this.aClass83_1 = null;
							}
						}
					} catch (@Pc(352) Exception local352) {
					}
					if (local75 && this.aFile6 != null) {
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
