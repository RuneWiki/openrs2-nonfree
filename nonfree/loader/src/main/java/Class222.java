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
public final class Class222 {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class222() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method5741(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(28) boolean local28 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local28) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(39) Throwable local39) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(68) Field local68 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local68.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(75) Throwable local75) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(I)[I")
	public int[] method5742() {
		@Pc(9) DisplayMode[] local9 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(15) int[] local15 = new int[local9.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
			local15[local17 << 2] = local9[local17].getWidth();
			local15[(local17 << 2) + 1] = local9[local17].getHeight();
			local15[(local17 << 2) + 2] = local9[local17].getBitDepth();
			local15[(local17 << 2) + 3] = local9[local17].getRefreshRate();
		}
		return local15;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BLjava/awt/Frame;IIII)V")
	public void method5743(@OriginalArg(1) Frame arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method5741(arg0);
		if (arg1 == 0) {
			@Pc(35) int local35 = this.aDisplayMode1.getRefreshRate();
			@Pc(39) DisplayMode[] local39 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < local39.length; local43++) {
				if (local39[local43].getWidth() == arg2 && local39[local43].getHeight() == arg4 && local39[local43].getBitDepth() == arg3) {
					@Pc(71) int local71 = local39[local43].getRefreshRate();
					if (!local41 || Math.abs(local71 - local35) < Math.abs(arg1 - local35)) {
						local41 = true;
						arg1 = local71;
					}
				}
			}
			if (!local41) {
				arg1 = local35;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg2, arg4, arg3, arg1));
	}

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "(I)V")
	public void method5744() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5741(null);
	}
}
