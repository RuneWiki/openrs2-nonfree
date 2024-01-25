import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class Class277 {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class277() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(I)[I")
	public int[] method6346() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "(I)V")
	public void method6347() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6349(null);
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/awt/Frame;IIIIB)V")
	public void method6348(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method6349(arg0);
		if (arg2 == 0) {
			@Pc(29) int local29 = this.aDisplayMode1.getRefreshRate();
			@Pc(33) DisplayMode[] local33 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < local33.length; local37++) {
				if (local33[local37].getWidth() == arg4 && arg1 == local33[local37].getHeight() && arg3 == local33[local37].getBitDepth()) {
					@Pc(68) int local68 = local33[local37].getRefreshRate();
					if (!local35 || Math.abs(local68 - local29) < Math.abs(arg2 - local29)) {
						local35 = true;
						arg2 = local68;
					}
				}
			}
			if (!local35) {
				arg2 = local29;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg1, arg3, arg2));
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	private void method6349(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(22) boolean local22 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local22) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}
}
