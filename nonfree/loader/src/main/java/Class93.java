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

@OriginalClass("loader!qf")
public final class Class93 implements Runnable {

	@OriginalMember(owner = "loader!qf", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!qf", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!qf", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!qf", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!qf", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!qf", name = "s", descriptor = "I")
	private static final int anInt4298 = 1;

	@OriginalMember(owner = "loader!qf", name = "c", descriptor = "[Lloader!kc;")
	private Class91[] aClass91Array1;

	@OriginalMember(owner = "loader!qf", name = "o", descriptor = "Lloader!f;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!qf", name = "j", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!qf", name = "h", descriptor = "Lloader!oc;")
	private Class92 aClass92_2 = null;

	@OriginalMember(owner = "loader!qf", name = "f", descriptor = "Lloader!oc;")
	private Class92 aClass92_3 = null;

	@OriginalMember(owner = "loader!qf", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!qf", name = "e", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "loader!qf", name = "b", descriptor = "Lloader!kc;")
	private Class91 aClass91_1 = null;

	@OriginalMember(owner = "loader!qf", name = "l", descriptor = "Lloader!kc;")
	private Class91 aClass91_2 = null;

	@OriginalMember(owner = "loader!qf", name = "d", descriptor = "Lloader!kc;")
	private Class91 aClass91_3 = null;

	@OriginalMember(owner = "loader!qf", name = "n", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!qf", name = "m", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!qf", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!qf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class93(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString9 = "1.1";
		aString7 = "Unknown";
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
		} catch (@Pc(59) Exception local59) {
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
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method3240(arg4, arg3, arg2);
		this.aBoolean209 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!qf", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3240(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(84) int local84 = 0; local84 < local75.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local44.length; local90++) {
					try {
						@Pc(98) String local98 = local44[local90];
						if (local98.length() > 0 && !(new File(local98)).exists()) {
							continue;
						}
						@Pc(126) File local126 = new File(local98 + local75[local84]);
						@Pc(136) boolean local136;
						if (local77 == 1 && !local126.exists()) {
							local136 = local126.mkdir();
							if (!local136) {
								continue;
							}
						}
						@Pc(148) File local148;
						if (this.aClass91_1 == null) {
							try {
								local148 = new File(local126, "random.dat");
								if (local77 == 1 || local148.exists()) {
									this.aClass91_1 = new Class91(local148, "rw", 25L);
								}
							} catch (@Pc(165) Exception local165) {
								this.aClass91_1 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(222) int local222;
							try {
								local126 = new File(local126, arg1);
								if (local77 == 1 && !local126.exists()) {
									local136 = local126.mkdir();
									if (!local136) {
										continue;
									}
								}
								local148 = new File(local126, "main_file_cache.dat2");
								if (local77 == 0 && !local148.exists()) {
									continue;
								}
								this.aClass91_3 = new Class91(local148, "rw", 104857600L);
								this.aClass91Array1 = new Class91[16];
								for (local222 = 0; local222 < 16; local222++) {
									this.aClass91Array1[local222] = new Class91(new File(local126, "main_file_cache.idx" + local222), "rw", 1048576L);
								}
								this.aClass91_2 = new Class91(new File(local126, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local126;
							} catch (@Pc(268) Exception local268) {
								try {
									this.aClass91_3.method3227();
									for (local222 = 0; local222 < 16; local222++) {
										this.aClass91Array1[local222].method3227();
									}
									this.aClass91_2.method3227();
								} catch (@Pc(293) Exception local293) {
								}
								this.aClass91Array1 = null;
								this.aFile5 = this.aFile6 = null;
								this.aClass91_3 = this.aClass91_2 = null;
							}
						}
					} catch (@Pc(310) Exception local310) {
					}
					if (this.aClass91_1 != null && this.aFile6 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile6 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!qf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class92 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean209) {
						return;
					}
					if (this.aClass92_3 != null) {
						local16 = this.aClass92_3;
						this.aClass92_3 = this.aClass92_3.aClass92_1;
						if (this.aClass92_3 == null) {
							this.aClass92_2 = null;
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
				@Pc(44) int local44 = local16.anInt4296;
				if (local44 == 1) {
					local16.anObject5 = new Socket(InetAddress.getByName((String) local16.anObject6), local16.anInt4297);
				} else if (local44 == 2) {
					@Pc(69) Thread local69 = new Thread((Runnable) local16.anObject6);
					local69.setDaemon(true);
					local69.start();
					local69.setPriority(local16.anInt4297);
					local16.anObject5 = local69;
				} else if (local44 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(97) Object[] local97;
					if (local44 == 8) {
						local97 = (Object[]) local16.anObject6;
						if (((Class) local97[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local97[0]).getDeclaredMethod((String) local97[1], (Class[]) local97[2]);
					} else if (local44 == 9) {
						local97 = (Object[]) local16.anObject6;
						if (((Class) local97[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local97[0]).getDeclaredField((String) local97[1]);
					} else if (local44 == 3) {
						@Pc(201) String local201 = (local16.anInt4297 >> 24 & 0xFF) + "." + (local16.anInt4297 >> 16 & 0xFF) + "." + (local16.anInt4297 >> 8 & 0xFF) + "." + (local16.anInt4297 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local201).getHostName();
					}
				}
				local16.anInt4295 = 1;
			} catch (@Pc(221) ThreadDeath local221) {
				throw local221;
			} catch (@Pc(224) Throwable local224) {
				local16.anInt4295 = 2;
			}
		}
	}
}
