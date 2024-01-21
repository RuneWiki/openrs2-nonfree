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

@OriginalClass("loader!vf")
public final class Class87 implements Runnable {

	@OriginalMember(owner = "loader!vf", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!vf", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!vf", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!vf", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!vf", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!vf", name = "o", descriptor = "I")
	private static final int anInt3415 = 1;

	@OriginalMember(owner = "loader!vf", name = "e", descriptor = "Lloader!uf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!vf", name = "a", descriptor = "[Lloader!oe;")
	private Class86[] aClass86Array1;

	@OriginalMember(owner = "loader!vf", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!vf", name = "b", descriptor = "Lloader!bd;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!vf", name = "h", descriptor = "Lloader!bd;")
	private Class85 aClass85_3 = null;

	@OriginalMember(owner = "loader!vf", name = "g", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!vf", name = "m", descriptor = "Lloader!oe;")
	private Class86 aClass86_3 = null;

	@OriginalMember(owner = "loader!vf", name = "k", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "loader!vf", name = "l", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!vf", name = "d", descriptor = "Lloader!oe;")
	private Class86 aClass86_1 = null;

	@OriginalMember(owner = "loader!vf", name = "p", descriptor = "Lloader!oe;")
	private Class86 aClass86_2 = null;

	@OriginalMember(owner = "loader!vf", name = "j", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!vf", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!vf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class87(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString8 = "Unknown";
		aString7 = "1.1";
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
		this.method2229(arg3, arg4, arg2);
		this.aBoolean128 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!vf", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method2229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local69.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local44.length; local96++) {
					try {
						@Pc(104) String local104 = local44[local96];
						if (local104.length() > 0 && !(new File(local104)).exists()) {
							continue;
						}
						@Pc(132) File local132 = new File(local104 + local69[local86]);
						@Pc(144) boolean local144;
						if (local79 == 1 && !local132.exists()) {
							local144 = local132.mkdir();
							if (!local144) {
								continue;
							}
						}
						@Pc(157) File local157;
						if (this.aClass86_2 == null) {
							try {
								local157 = new File(local132, "random.dat");
								if (local79 == 1 || local157.exists()) {
									this.aClass86_2 = new Class86(local157, "rw", 25L);
								}
							} catch (@Pc(174) Exception local174) {
								this.aClass86_2 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(225) int local225;
							try {
								local132 = new File(local132, arg0);
								if (local79 == 1 && !local132.exists()) {
									local144 = local132.mkdir();
									if (!local144) {
										continue;
									}
								}
								local157 = new File(local132, "main_file_cache.dat2");
								if (local79 == 0 && !local157.exists()) {
									continue;
								}
								this.aClass86_1 = new Class86(local157, "rw", 52428800L);
								this.aClass86Array1 = new Class86[16];
								for (local225 = 0; local225 < 16; local225++) {
									this.aClass86Array1[local225] = new Class86(new File(local132, "main_file_cache.idx" + local225), "rw", 1048576L);
								}
								this.aClass86_3 = new Class86(new File(local132, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local132;
							} catch (@Pc(275) Exception local275) {
								try {
									this.aClass86_1.method2218();
									for (local225 = 0; local225 < 16; local225++) {
										this.aClass86Array1[local225].method2218();
									}
									this.aClass86_3.method2218();
								} catch (@Pc(298) Exception local298) {
								}
								this.aClass86_1 = this.aClass86_3 = null;
								this.aClass86Array1 = null;
								this.aFile6 = this.aFile5 = null;
							}
						}
					} catch (@Pc(315) Exception local315) {
					}
					if (this.aClass86_2 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!vf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class85 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean128) {
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
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local17.anInt3410;
				if (local47 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt3409);
				} else if (local47 == 2) {
					@Pc(199) Thread local199 = new Thread((Runnable) local17.anObject6);
					local199.setDaemon(true);
					local199.start();
					local199.setPriority(local17.anInt3409);
					local17.anObject5 = local199;
				} else if (local47 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local47 == 8) {
						local81 = (Object[]) local17.anObject6;
						if (((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local47 == 9) {
						local81 = (Object[]) local17.anObject6;
						if (((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else if (local47 == 3) {
						@Pc(143) String local143 = (local17.anInt3409 >> 24 & 0xFF) + "." + (local17.anInt3409 >> 16 & 0xFF) + "." + (local17.anInt3409 >> 8 & 0xFF) + "." + (local17.anInt3409 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local143).getHostName();
					}
				}
				local17.anInt3411 = 1;
			} catch (@Pc(216) ThreadDeath local216) {
				throw local216;
			} catch (@Pc(219) Throwable local219) {
				local17.anInt3411 = 2;
			}
		}
	}
}
