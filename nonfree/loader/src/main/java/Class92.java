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

@OriginalClass("loader!ma")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "loader!ma", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!ma", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!ma", name = "k", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ma", name = "m", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ma", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!ma", name = "g", descriptor = "I")
	private static final int anInt4615 = 1;

	@OriginalMember(owner = "loader!ma", name = "j", descriptor = "Lloader!ve;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ma", name = "s", descriptor = "[Lloader!hh;")
	private Class91[] aClass91Array1;

	@OriginalMember(owner = "loader!ma", name = "b", descriptor = "Lloader!hh;")
	private Class91 aClass91_1 = null;

	@OriginalMember(owner = "loader!ma", name = "d", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ma", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ma", name = "a", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "loader!ma", name = "n", descriptor = "Lloader!hh;")
	private Class91 aClass91_3 = null;

	@OriginalMember(owner = "loader!ma", name = "o", descriptor = "Lloader!sh;")
	private Class93 aClass93_1 = null;

	@OriginalMember(owner = "loader!ma", name = "q", descriptor = "Lloader!hh;")
	private Class91 aClass91_2 = null;

	@OriginalMember(owner = "loader!ma", name = "p", descriptor = "Lloader!sh;")
	private Class93 aClass93_2 = null;

	@OriginalMember(owner = "loader!ma", name = "r", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!ma", name = "i", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ma", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ma", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class92(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
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
		} catch (@Pc(125) Exception local125) {
		}
		this.method3044(arg3, arg2, arg4);
		this.aBoolean189 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ma", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method3044(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(47) String[] local47 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local47.length; local90++) {
					try {
						@Pc(98) String local98 = local47[local90];
						if (local98.length() > 0 && !(new File(local98)).exists()) {
							continue;
						}
						@Pc(124) File local124 = new File(local98 + local77[local84]);
						@Pc(134) boolean local134;
						if (local79 == 1 && !local124.exists()) {
							local134 = local124.mkdir();
							if (!local134) {
								continue;
							}
						}
						@Pc(147) File local147;
						if (this.aClass91_1 == null) {
							try {
								local147 = new File(local124, "random.dat");
								if (local79 == 1 || local147.exists()) {
									this.aClass91_1 = new Class91(local147, "rw", 25L);
								}
							} catch (@Pc(166) Exception local166) {
								this.aClass91_1 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(220) int local220;
							try {
								local124 = new File(local124, arg0);
								if (local79 == 1 && !local124.exists()) {
									local134 = local124.mkdir();
									if (!local134) {
										continue;
									}
								}
								local147 = new File(local124, "main_file_cache.dat2");
								if (local79 == 0 && !local147.exists()) {
									continue;
								}
								this.aClass91_3 = new Class91(local147, "rw", 104857600L);
								this.aClass91Array1 = new Class91[16];
								for (local220 = 0; local220 < 16; local220++) {
									this.aClass91Array1[local220] = new Class91(new File(local124, "main_file_cache.idx" + local220), "rw", 1048576L);
								}
								this.aClass91_2 = new Class91(new File(local124, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local124;
							} catch (@Pc(270) Exception local270) {
								try {
									this.aClass91_3.method3034();
									for (local220 = 0; local220 < 16; local220++) {
										this.aClass91Array1[local220].method3034();
									}
									this.aClass91_2.method3034();
								} catch (@Pc(299) Exception local299) {
								}
								this.aClass91Array1 = null;
								this.aFile5 = this.aFile6 = null;
								this.aClass91_3 = this.aClass91_2 = null;
							}
						}
					} catch (@Pc(316) Exception local316) {
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

	@OriginalMember(owner = "loader!ma", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class93 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean189) {
						return;
					}
					if (this.aClass93_1 != null) {
						local17 = this.aClass93_1;
						this.aClass93_1 = this.aClass93_1.aClass93_3;
						if (this.aClass93_1 == null) {
							this.aClass93_2 = null;
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
				@Pc(46) int local46 = local17.anInt4617;
				if (local46 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt4616);
				} else if (local46 == 2) {
					@Pc(206) Thread local206 = new Thread((Runnable) local17.anObject5);
					local206.setDaemon(true);
					local206.start();
					local206.setPriority(local17.anInt4616);
					local17.anObject6 = local206;
				} else if (local46 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local46 == 8) {
						local81 = (Object[]) local17.anObject5;
						if (((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local46 == 9) {
						local81 = (Object[]) local17.anObject5;
						if (((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else if (local46 == 3) {
						@Pc(155) String local155 = (local17.anInt4616 >> 24 & 0xFF) + "." + (local17.anInt4616 >> 16 & 0xFF) + "." + (local17.anInt4616 >> 8 & 0xFF) + "." + (local17.anInt4616 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local155).getHostName();
					}
				}
				local17.anInt4618 = 1;
			} catch (@Pc(223) ThreadDeath local223) {
				throw local223;
			} catch (@Pc(226) Throwable local226) {
				local17.anInt4618 = 2;
			}
		}
	}
}
