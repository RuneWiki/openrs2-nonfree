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

@OriginalClass("loader!ih")
public final class Class93 implements Runnable {

	@OriginalMember(owner = "loader!ih", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!ih", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ih", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!ih", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!ih", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ih", name = "k", descriptor = "I")
	private static final int anInt4209 = 1;

	@OriginalMember(owner = "loader!ih", name = "d", descriptor = "Lloader!ma;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ih", name = "m", descriptor = "[Lloader!u;")
	private Class94[] aClass94Array1;

	@OriginalMember(owner = "loader!ih", name = "h", descriptor = "Lloader!u;")
	private Class94 aClass94_1 = null;

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ih", name = "q", descriptor = "Lloader!ca;")
	private Class92 aClass92_2 = null;

	@OriginalMember(owner = "loader!ih", name = "r", descriptor = "Lloader!ca;")
	private Class92 aClass92_3 = null;

	@OriginalMember(owner = "loader!ih", name = "p", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "loader!ih", name = "j", descriptor = "Lloader!u;")
	private Class94 aClass94_2 = null;

	@OriginalMember(owner = "loader!ih", name = "n", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!ih", name = "f", descriptor = "Lloader!u;")
	private Class94 aClass94_3 = null;

	@OriginalMember(owner = "loader!ih", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ih", name = "l", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ih", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ih", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class93(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet2 = arg1;
		aString8 = "1.1";
		aString9 = "Unknown";
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
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method2831(arg2, arg4, arg3);
		this.aBoolean177 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ih", name = "a", descriptor = "(IIBLjava/lang/String;)V")
	private void method2831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(49) String[] local49 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(83) int local83 = 0; local83 < local74.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local49.length; local93++) {
					try {
						@Pc(101) String local101 = local49[local93];
						if (local101.length() > 0 && !(new File(local101)).exists()) {
							continue;
						}
						@Pc(125) File local125 = new File(local101 + local74[local83]);
						@Pc(134) boolean local134;
						if (local76 == 1 && !local125.exists()) {
							local134 = local125.mkdir();
							if (!local134) {
								continue;
							}
						}
						@Pc(149) File local149;
						if (this.aClass94_3 == null) {
							try {
								local149 = new File(local125, "random.dat");
								if (local76 == 1 || local149.exists()) {
									this.aClass94_3 = new Class94(local149, "rw", 25L);
								}
							} catch (@Pc(165) Exception local165) {
								this.aClass94_3 = null;
							}
						}
						if (this.aFile4 == null) {
							@Pc(225) int local225;
							try {
								local125 = new File(local125, arg2);
								if (local76 == 1 && !local125.exists()) {
									local134 = local125.mkdir();
									if (!local134) {
										continue;
									}
								}
								local149 = new File(local125, "main_file_cache.dat2");
								if (local76 == 0 && !local149.exists()) {
									continue;
								}
								this.aClass94_2 = new Class94(local149, "rw", 104857600L);
								this.aClass94Array1 = new Class94[16];
								for (local225 = 0; local225 < 16; local225++) {
									this.aClass94Array1[local225] = new Class94(new File(local125, "main_file_cache.idx" + local225), "rw", 1048576L);
								}
								this.aClass94_1 = new Class94(new File(local125, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local125;
							} catch (@Pc(271) Exception local271) {
								try {
									this.aClass94_2.method2848();
									for (local225 = 0; local225 < 16; local225++) {
										this.aClass94Array1[local225].method2848();
									}
									this.aClass94_1.method2848();
								} catch (@Pc(298) Exception local298) {
								}
								this.aFile5 = this.aFile4 = null;
								this.aClass94_2 = this.aClass94_1 = null;
								this.aClass94Array1 = null;
							}
						}
					} catch (@Pc(315) Exception local315) {
					}
					if (this.aClass94_3 != null && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!ih", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class92 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean177) {
						return;
					}
					if (this.aClass92_2 != null) {
						local17 = this.aClass92_2;
						this.aClass92_2 = this.aClass92_2.aClass92_1;
						if (this.aClass92_2 == null) {
							this.aClass92_3 = null;
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
				@Pc(45) int local45 = local17.anInt4206;
				if (local45 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt4208);
				} else if (local45 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local17.anObject5);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local17.anInt4208);
					local17.anObject6 = local60;
				} else if (local45 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(94) Object[] local94;
					if (local45 == 8) {
						local94 = (Object[]) local17.anObject5;
						if (((Class) local94[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local94[0]).getDeclaredMethod((String) local94[1], (Class[]) local94[2]);
					} else if (local45 == 9) {
						local94 = (Object[]) local17.anObject5;
						if (((Class) local94[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local94[0]).getDeclaredField((String) local94[1]);
					} else if (local45 == 3) {
						@Pc(194) String local194 = (local17.anInt4208 >> 24 & 0xFF) + "." + (local17.anInt4208 >> 16 & 0xFF) + "." + (local17.anInt4208 >> 8 & 0xFF) + "." + (local17.anInt4208 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local194).getHostName();
					}
				}
				local17.anInt4207 = 1;
			} catch (@Pc(216) ThreadDeath local216) {
				throw local216;
			} catch (@Pc(219) Throwable local219) {
				local17.anInt4207 = 2;
			}
		}
	}
}
