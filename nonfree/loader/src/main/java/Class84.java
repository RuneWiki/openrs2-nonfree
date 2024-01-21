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

@OriginalClass("loader!de")
public final class Class84 implements Runnable {

	@OriginalMember(owner = "loader!de", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!de", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!de", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!de", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!de", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!de", name = "n", descriptor = "I")
	private static final int anInt2906 = 1;

	@OriginalMember(owner = "loader!de", name = "b", descriptor = "[Lloader!af;")
	private Class83[] aClass83Array1;

	@OriginalMember(owner = "loader!de", name = "q", descriptor = "Lloader!ca;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!de", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!de", name = "d", descriptor = "Lloader!jb;")
	private Class85 aClass85_1 = null;

	@OriginalMember(owner = "loader!de", name = "p", descriptor = "Lloader!af;")
	private Class83 aClass83_1 = null;

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!de", name = "k", descriptor = "Lloader!jb;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!de", name = "h", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!de", name = "r", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "loader!de", name = "j", descriptor = "Lloader!af;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!de", name = "o", descriptor = "I")
	private int anInt2907 = 0;

	@OriginalMember(owner = "loader!de", name = "c", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!de", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!de", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class84(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString7 = "Unknown";
		aString9 = "1.1";
		this.anApplet2 = arg1;
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
		} catch (@Pc(61) Exception local61) {
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
		} catch (@Pc(127) Exception local127) {
		}
		this.method1965(arg3, arg2, arg4);
		this.aBoolean134 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class85 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean134) {
						return;
					}
					if (this.aClass85_1 != null) {
						local16 = this.aClass85_1;
						this.aClass85_1 = this.aClass85_1.aClass85_3;
						if (this.aClass85_1 == null) {
							this.aClass85_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local16.anInt2910;
				if (local44 == 1) {
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject5), local16.anInt2908);
				} else if (local44 == 2) {
					@Pc(59) Thread local59 = new Thread((Runnable) local16.anObject5);
					local59.setDaemon(true);
					local59.start();
					local59.setPriority(local16.anInt2908);
					local16.anObject6 = local59;
				} else if (local44 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(145) Object[] local145;
					if (local44 == 8) {
						local145 = (Object[]) local16.anObject5;
						if (((Class) local145[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local145[0]).getDeclaredMethod((String) local145[1], (Class[]) local145[2]);
					} else if (local44 == 9) {
						local145 = (Object[]) local16.anObject5;
						if (((Class) local145[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local145[0]).getDeclaredField((String) local145[1]);
					} else if (local44 == 3) {
						@Pc(134) String local134 = (local16.anInt2908 >> 24 & 0xFF) + "." + (local16.anInt2908 >> 16 & 0xFF) + "." + (local16.anInt2908 >> 8 & 0xFF) + "." + (local16.anInt2908 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local134).getHostName();
					}
				}
				local16.anInt2909 = 1;
			} catch (@Pc(217) ThreadDeath local217) {
				throw local217;
			} catch (@Pc(220) Throwable local220) {
				local16.anInt2909 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/String;BII)V")
	private void method1965(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(57) String[] local57 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString8, "" };
		@Pc(82) String[] local82 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(84) boolean local84 = false;
		for (@Pc(86) int local86 = 0; local86 < 2; local86++) {
			for (@Pc(91) int local91 = 0; local91 < local82.length; local91++) {
				for (@Pc(101) int local101 = 0; local101 < local57.length; local101++) {
					try {
						@Pc(113) String local113 = local57[local101];
						if (local113.length() > 0 && !(new File(local113)).exists()) {
							continue;
						}
						@Pc(140) File local140 = new File(local113 + local82[local91]);
						@Pc(150) boolean local150;
						if (local86 == 1 && !local140.exists()) {
							local150 = local140.mkdir();
							if (!local150) {
								continue;
							}
						}
						@Pc(176) int local176;
						@Pc(163) File local163;
						if (!local84) {
							try {
								local163 = new File(local140, "uid.dat");
								if (local86 == 1 && (!local163.exists() || local163.length() < 4L)) {
									local176 = -1;
									@Pc(180) Random local180 = new Random();
									while (local176 == -1) {
										local176 = local180.nextInt();
									}
									@Pc(196) DataOutputStream local196 = new DataOutputStream(new FileOutputStream(local163));
									local196.writeInt(local176);
									local196.close();
								}
								if (local163.exists()) {
									local84 = true;
									@Pc(215) DataInputStream local215 = new DataInputStream(new FileInputStream(local163));
									this.anInt2907 = local215.readInt() + 1;
									local215.close();
								}
							} catch (@Pc(225) Exception local225) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local140 = new File(local140, arg0);
								if (local86 == 1 && !local140.exists()) {
									local150 = local140.mkdir();
									if (!local150) {
										continue;
									}
								}
								local163 = new File(local140, "main_file_cache.dat2");
								if (local86 == 0 && !local163.exists()) {
									continue;
								}
								this.aClass83_2 = new Class83(local163, "rw", 52428800L);
								this.aClass83Array1 = new Class83[16];
								for (local176 = 0; local176 < 16; local176++) {
									this.aClass83Array1[local176] = new Class83(new File(local140, "main_file_cache.idx" + local176), "rw", 1048576L);
								}
								this.aClass83_1 = new Class83(new File(local140, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local140;
							} catch (@Pc(328) Exception local328) {
								try {
									this.aClass83_2.method1948();
									for (local176 = 0; local176 < 16; local176++) {
										this.aClass83Array1[local176].method1948();
									}
									this.aClass83_1.method1948();
								} catch (@Pc(351) Exception local351) {
								}
								this.aClass83Array1 = null;
								this.aClass83_2 = this.aClass83_1 = null;
								this.aFile6 = this.aFile5 = null;
							}
						}
					} catch (@Pc(368) Exception local368) {
					}
					if (local84 && this.aFile5 != null) {
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
