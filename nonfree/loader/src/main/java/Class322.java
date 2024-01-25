import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class322 {

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class322() throws Exception {
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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(I)[I")
	public int[] method7549() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local3.length; local18++) {
			local9[local18 << 2] = local3[local18].getWidth();
			local9[(local18 << 2) + 1] = local3[local18].getHeight();
			local9[(local18 << 2) + 2] = local3[local18].getBitDepth();
			local9[(local18 << 2) + 3] = local3[local18].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(B)V")
	public void method7550() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method7552(null);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method7551(@OriginalArg(0) int arg0, @OriginalArg(2) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method7552(arg1);
		if (arg2 == 0) {
			@Pc(29) int local29 = this.aDisplayMode1.getRefreshRate();
			@Pc(33) DisplayMode[] local33 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < local33.length; local37++) {
				if (arg4 == local33[local37].getWidth() && arg3 == local33[local37].getHeight() && local33[local37].getBitDepth() == arg0) {
					@Pc(69) int local69 = local33[local37].getRefreshRate();
					if (!local35 || Math.abs(local69 - local29) < Math.abs(arg2 - local29)) {
						local35 = true;
						arg2 = local69;
					}
				}
			}
			if (!local35) {
				arg2 = local29;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg3, arg0, arg2));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	private void method7552(@OriginalArg(1) Frame arg0) {
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			;
		}
	}
}
