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

@OriginalClass("loader!q")
public final class Class86 implements Runnable {

	@OriginalMember(owner = "loader!q", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!q", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!q", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!q", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!q", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!q", name = "f", descriptor = "I")
	private static final int anInt3089 = 1;

	@OriginalMember(owner = "loader!q", name = "a", descriptor = "Lloader!bc;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!q", name = "p", descriptor = "[Lloader!v;")
	private Class87[] aClass87Array1;

	@OriginalMember(owner = "loader!q", name = "m", descriptor = "Lloader!v;")
	private Class87 aClass87_1 = null;

	@OriginalMember(owner = "loader!q", name = "b", descriptor = "Lloader!g;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!q", name = "q", descriptor = "Lloader!v;")
	private Class87 aClass87_2 = null;

	@OriginalMember(owner = "loader!q", name = "g", descriptor = "Lloader!v;")
	private Class87 aClass87_3 = null;

	@OriginalMember(owner = "loader!q", name = "c", descriptor = "Lloader!g;")
	private Class85 aClass85_3 = null;

	@OriginalMember(owner = "loader!q", name = "s", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!q", name = "d", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!q", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!q", name = "l", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "loader!q", name = "n", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!q", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!q", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class86(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString9 = "Unknown";
		aString7 = "1.1";
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
		} catch (@Pc(61) Exception local61) {
		}
		if (aString8 == null) {
			aString8 = "~/";
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
		} catch (@Pc(126) Exception local126) {
		}
		this.method2253(arg3, arg2, arg4);
		this.aBoolean254 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!q", name = "a", descriptor = "(Ljava/lang/String;IBI)V")
	private void method2253(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(47) String[] local47 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		@Pc(72) String[] local72 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(74) int local74 = 0; local74 < 2; local74++) {
			for (@Pc(81) int local81 = 0; local81 < local72.length; local81++) {
				for (@Pc(87) int local87 = 0; local87 < local47.length; local87++) {
					try {
						@Pc(99) String local99 = local47[local87];
						if (local99.length() > 0 && !(new File(local99)).exists()) {
							continue;
						}
						@Pc(126) File local126 = new File(local99 + local72[local81]);
						@Pc(135) boolean local135;
						if (local74 == 1 && !local126.exists()) {
							local135 = local126.mkdir();
							if (!local135) {
								continue;
							}
						}
						@Pc(147) File local147;
						if (this.aClass87_3 == null) {
							try {
								local147 = new File(local126, "random.dat");
								if (local74 == 1 || local147.exists()) {
									this.aClass87_3 = new Class87(local147, "rw", 25L);
								}
							} catch (@Pc(166) Exception local166) {
								this.aClass87_3 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(221) int local221;
							try {
								local126 = new File(local126, arg0);
								if (local74 == 1 && !local126.exists()) {
									local135 = local126.mkdir();
									if (!local135) {
										continue;
									}
								}
								local147 = new File(local126, "main_file_cache.dat2");
								if (local74 == 0 && !local147.exists()) {
									continue;
								}
								this.aClass87_2 = new Class87(local147, "rw", 52428800L);
								this.aClass87Array1 = new Class87[16];
								for (local221 = 0; local221 < 16; local221++) {
									this.aClass87Array1[local221] = new Class87(new File(local126, "main_file_cache.idx" + local221), "rw", 1048576L);
								}
								this.aClass87_1 = new Class87(new File(local126, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local126;
							} catch (@Pc(267) Exception local267) {
								try {
									this.aClass87_2.method2263();
									for (local221 = 0; local221 < 16; local221++) {
										this.aClass87Array1[local221].method2263();
									}
									this.aClass87_1.method2263();
								} catch (@Pc(294) Exception local294) {
								}
								this.aClass87Array1 = null;
								this.aFile4 = this.aFile5 = null;
								this.aClass87_2 = this.aClass87_1 = null;
							}
						}
					} catch (@Pc(311) Exception local311) {
					}
					if (this.aClass87_3 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!q", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class85 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean254) {
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
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local17.anInt3086;
				if (local45 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject7), local17.anInt3084);
				} else if (local45 == 2) {
					@Pc(186) Thread local186 = new Thread((Runnable) local17.anObject7);
					local186.setDaemon(true);
					local186.start();
					local186.setPriority(local17.anInt3084);
					local17.anObject6 = local186;
				} else if (local45 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject7).openStream());
				} else {
					@Pc(64) Object[] local64;
					if (local45 == 8) {
						local64 = (Object[]) local17.anObject7;
						if (((Class) local64[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local64[0]).getDeclaredMethod((String) local64[1], (Class[]) local64[2]);
					} else if (local45 == 9) {
						local64 = (Object[]) local17.anObject7;
						if (((Class) local64[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local64[0]).getDeclaredField((String) local64[1]);
					} else if (local45 == 3) {
						@Pc(135) String local135 = (local17.anInt3084 >> 24 & 0xFF) + "." + (local17.anInt3084 >> 16 & 0xFF) + "." + (local17.anInt3084 >> 8 & 0xFF) + "." + (local17.anInt3084 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local135).getHostName();
					}
				}
				local17.anInt3085 = 1;
			} catch (@Pc(215) ThreadDeath local215) {
				throw local215;
			} catch (@Pc(218) Throwable local218) {
				local17.anInt3085 = 2;
			}
		}
	}
}
