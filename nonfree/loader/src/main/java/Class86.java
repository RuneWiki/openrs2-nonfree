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

@OriginalClass("loader!u")
public final class Class86 implements Runnable {

	@OriginalMember(owner = "loader!u", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!u", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!u", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!u", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!u", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!u", name = "k", descriptor = "I")
	private static final int anInt3495 = 1;

	@OriginalMember(owner = "loader!u", name = "g", descriptor = "Lloader!we;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!u", name = "n", descriptor = "[Lloader!ed;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "loader!u", name = "a", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!u", name = "d", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!u", name = "e", descriptor = "Lloader!af;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!u", name = "m", descriptor = "I")
	private int anInt3496 = 0;

	@OriginalMember(owner = "loader!u", name = "s", descriptor = "Lloader!ed;")
	private Class85 aClass85_1 = null;

	@OriginalMember(owner = "loader!u", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!u", name = "i", descriptor = "Lloader!af;")
	private Class83 aClass83_3 = null;

	@OriginalMember(owner = "loader!u", name = "q", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "loader!u", name = "h", descriptor = "Lloader!ed;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!u", name = "r", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!u", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!u", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class86(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "1.1";
		aString9 = "Unknown";
		this.anApplet3 = arg1;
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
		} catch (@Pc(70) Throwable local70) {
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
		} catch (@Pc(125) Exception local125) {
		}
		this.method2337(arg2, arg3, arg4);
		this.aBoolean135 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!u", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class83 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean135) {
						return;
					}
					if (this.aClass83_2 != null) {
						local17 = this.aClass83_2;
						this.aClass83_2 = this.aClass83_2.aClass83_1;
						if (this.aClass83_2 == null) {
							this.aClass83_3 = null;
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
				@Pc(47) int local47 = local17.anInt3489;
				if (local47 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt3490);
				} else if (local47 == 2) {
					@Pc(64) Thread local64 = new Thread((Runnable) local17.anObject6);
					local64.setDaemon(true);
					local64.start();
					local64.setPriority(local17.anInt3490);
					local17.anObject5 = local64;
				} else if (local47 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(151) Object[] local151;
					if (local47 == 8) {
						local151 = (Object[]) local17.anObject6;
						if (((Class) local151[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local151[0]).getDeclaredMethod((String) local151[1], (Class[]) local151[2]);
					} else if (local47 == 9) {
						local151 = (Object[]) local17.anObject6;
						if (((Class) local151[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local151[0]).getDeclaredField((String) local151[1]);
					} else if (local47 == 3) {
						@Pc(140) String local140 = (local17.anInt3490 >> 24 & 0xFF) + "." + (local17.anInt3490 >> 16 & 0xFF) + "." + (local17.anInt3490 >> 8 & 0xFF) + "." + (local17.anInt3490 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local140).getHostName();
					}
				}
				local17.anInt3491 = 1;
			} catch (@Pc(224) ThreadDeath local224) {
				throw local224;
			} catch (@Pc(227) Throwable local227) {
				local17.anInt3491 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!u", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method2337(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(37) String[] local37 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(39) boolean local39 = false;
		@Pc(74) String[] local74 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(81) int local81 = 0; local81 < local37.length; local81++) {
				for (@Pc(87) int local87 = 0; local87 < local74.length; local87++) {
					try {
						@Pc(95) String local95 = local74[local87];
						if (local95.length() > 0 && !(new File(local95)).exists()) {
							continue;
						}
						@Pc(123) File local123 = new File(local95 + local37[local81]);
						@Pc(135) boolean local135;
						if (local76 == 1 && !local123.exists()) {
							local135 = local123.mkdir();
							if (!local135) {
								continue;
							}
						}
						@Pc(163) int local163;
						@Pc(147) File local147;
						if (!local39) {
							try {
								local147 = new File(local123, "uid.dat");
								if (local76 == 1 && (!local147.exists() || local147.length() < 4L)) {
									local163 = -1;
									@Pc(167) Random local167 = new Random();
									while (local163 == -1) {
										local163 = local167.nextInt();
									}
									@Pc(182) DataOutputStream local182 = new DataOutputStream(new FileOutputStream(local147));
									local182.writeInt(local163);
									local182.close();
								}
								if (local147.exists()) {
									local39 = true;
									@Pc(200) DataInputStream local200 = new DataInputStream(new FileInputStream(local147));
									this.anInt3496 = local200.readInt() + 1;
									local200.close();
								}
							} catch (@Pc(210) Exception local210) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local123 = new File(local123, arg1);
								if (local76 == 1 && !local123.exists()) {
									local135 = local123.mkdir();
									if (!local135) {
										continue;
									}
								}
								local147 = new File(local123, "main_file_cache.dat2");
								if (local76 == 0 && !local147.exists()) {
									continue;
								}
								this.aClass85_1 = new Class85(local147, "rw", 52428800L);
								this.aClass85Array1 = new Class85[16];
								for (local163 = 0; local163 < 16; local163++) {
									this.aClass85Array1[local163] = new Class85(new File(local123, "main_file_cache.idx" + local163), "rw", 1048576L);
								}
								this.aClass85_2 = new Class85(new File(local123, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local123;
							} catch (@Pc(313) Exception local313) {
								try {
									this.aClass85_1.method2322();
									for (local163 = 0; local163 < 16; local163++) {
										this.aClass85Array1[local163].method2322();
									}
									this.aClass85_2.method2322();
								} catch (@Pc(340) Exception local340) {
								}
								this.aClass85_1 = this.aClass85_2 = null;
								this.aClass85Array1 = null;
								this.aFile6 = this.aFile5 = null;
							}
						}
					} catch (@Pc(357) Exception local357) {
					}
					if (local39 && this.aFile5 != null) {
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
